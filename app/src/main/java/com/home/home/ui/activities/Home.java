package com.home.home.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.home.home.R;
import com.home.home.models.Rooms;
import com.home.home.ui.adapters.RoomItemAdaper;
import com.home.home.ui.adapters.RoomsButtonAdapter;
import com.home.home.ui.adapters.SliderAdaper;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView roomRecyclerView;
    RecyclerView roomsParameters;
    ViewPager2 viewPagerCamerasSlider;
    RoomsButtonAdapter roomsButtonAdapter;
    ArrayList<Rooms> rooms = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Добавляем Комнаты
        rooms.add(new Rooms("Living Room", 60,  50, 100, R.drawable.living_room));
        rooms.add(new Rooms("Kitchen", 50,  50, 50, R.drawable.bedroom));
        rooms.add(new Rooms("Sleeping", 50,  50, 50, R.drawable.rectangle24));
        rooms.add(new Rooms("Bathroom", 50,  50, 50, R.drawable.bedroom));

        //Добавляем слайдер комнат
        viewPagerCamerasSlider = findViewById(R.id.viewPagerCamerasSlider);

        viewPagerCamerasSlider.setAdapter(new SliderAdaper(rooms, viewPagerCamerasSlider));
        viewPagerCamerasSlider.setClipToPadding(false);
        viewPagerCamerasSlider.setClipChildren(false);
        viewPagerCamerasSlider.setOffscreenPageLimit(3);
        viewPagerCamerasSlider.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        //Выбираем анимацию

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(20));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPagerCamerasSlider.setPageTransformer(compositePageTransformer);


        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this,LinearLayoutManager.HORIZONTAL,false
        );

        //Добавляеем RecyclerView кнопок
        roomRecyclerView = findViewById(R.id.buttonRecyclerView);
        roomRecyclerView.setLayoutManager(layoutManager);

        roomRecyclerView.setItemAnimator(new DefaultItemAnimator());
        roomRecyclerView.setAdapter(new RoomsButtonAdapter(this, rooms));
        


        roomsParameters = findViewById(R.id.roomParameterItem);
        LinearLayoutManager layoutParameter = new LinearLayoutManager(
                this,LinearLayoutManager.HORIZONTAL,false
        );
        roomsParameters.setLayoutManager(layoutParameter);
        roomsParameters.setItemAnimator(new DefaultItemAnimator());
        roomsParameters.setAdapter(new RoomItemAdaper(this, rooms));


    }
}
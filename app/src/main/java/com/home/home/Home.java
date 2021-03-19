package com.home.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ViewPager2 myViewPager2;
    RoomsButtonAdapter roomsButtonAdapter;

    //ArrayList<Button> rooms = new ArrayList<>();
    Button rooms = findViewById(R.id.rooms);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myViewPager2 = findViewById(R.id.viewPagerRooms);
        roomsButtonAdapter = new RoomsButtonAdapter(rooms);
        myViewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        myViewPager2.setAdapter(roomsButtonAdapter);
        myViewPager2.setOffscreenPageLimit(3);

    }



}
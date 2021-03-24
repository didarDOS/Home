package com.home.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.home.home.classes.Rooms;
import com.home.home.ui.RoomsButtonAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    TextView lighting_room;
    TextView temperature_room;
    TextView humidity_room;
    ViewPager2 myViewPager2;
    RoomsButtonAdapter roomsButtonAdapter;
    ArrayList<Rooms> rooms = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rooms.add(new Rooms("Living Room", 60,  50, 100));
        rooms.add(new Rooms("Living Room", 60,  50, 100));
        rooms.add(new Rooms("Kitchen", 50,  50, 50));
        rooms.add(new Rooms("Sleeping", 50,  50, 50));

        myViewPager2 = findViewById(R.id.viewPagerRooms);

        roomsButtonAdapter = new RoomsButtonAdapter(this, rooms);
        myViewPager2.setAdapter(roomsButtonAdapter);

        myViewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        lighting_room = findViewById(R.id.lighting_room);
        lighting_room.setText(String.valueOf(rooms.get(1).getLighting()));
        temperature_room = findViewById(R.id.thermostat_room);
        temperature_room.setText(String.valueOf(rooms.get(1).getTemperature()));
        humidity_room = findViewById(R.id.humidity_room);
        humidity_room.setText(String.valueOf(rooms.get(1).getHumidity()));
   

    }



}
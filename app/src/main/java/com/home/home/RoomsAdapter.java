package com.home.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class RoomsButtonAdapter extends RecyclerView.Adapter<RoomsButtonAdapter.RoomsButtonViewHolder> {

    //создаем массив кнопок
    private ArrayList<Button> rooms;


    public RoomsButtonAdapter(Button rooms) {
        this.rooms = rooms;
    }

    @NonNull
    @Override
    //Возьмем макет и передаем в качестве аргумента
    public RoomsButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.button_item, parent, false);
        return new RoomsButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomsButtonViewHolder holder, int position) {
        Button room = rooms.get(position);
        holder.rooms.setText(position);
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    //Создаем Держатель видимых вещей
    public class RoomsButtonViewHolder extends RecyclerView.ViewHolder{

        private Button rooms;

        public RoomsButtonViewHolder(@NonNull View itemView) {
            super(itemView);
            //Присвоим кнопку
            rooms = itemView.findViewById(R.id.rooms);
        }
    }
}

package com.home.home.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.home.home.R;
import com.home.home.models.Rooms;

import java.util.ArrayList;

public class RoomsButtonAdapter extends RecyclerView.Adapter<RoomsButtonAdapter.RoomsButtonViewHolder> {


    private Context context;
    //создаем массив кнопок
    private ArrayList<Rooms> rooms;

    public RoomsButtonAdapter(Context context, ArrayList<Rooms> rooms) {
        this.context = context;
        this.rooms = rooms;
    }

    @NonNull
    @Override
    //Возьмем макет и передаем в качестве аргумента
    public RoomsButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.button_room, parent, false);
        return new RoomsButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomsButtonViewHolder holder, int position) {
        holder.button_rooms.setText(rooms.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    //Создаем Держатель видимых вещей
    public class RoomsButtonViewHolder extends RecyclerView.ViewHolder{

        private Button button_rooms;

        public RoomsButtonViewHolder(@NonNull View itemView) {
            super(itemView);
            //Присвоим кнопку
            button_rooms = itemView.findViewById(R.id.btn_room);
        }
    }
}

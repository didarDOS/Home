package com.home.home.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.home.home.R;
import com.home.home.models.Rooms;

import java.util.ArrayList;

public class RoomItemAdaper extends RecyclerView.Adapter<RoomItemAdaper.RoomItemViewHolder> {

    private Context context;
    //создаем массив кнопок
    private ArrayList<Rooms> rooms;

    public RoomItemAdaper(Context context, ArrayList<Rooms> rooms) {
        this.context = context;
        this.rooms = rooms;
    }

    @NonNull
    @Override
    public RoomItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.button_item, parent, false);
        return new RoomItemAdaper.RoomItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomItemViewHolder holder, int position) {
        holder.itemImage.setImageResource(rooms.get(position).getImage());
        holder.itemParameterName.setText(rooms.get(position).getName());
        holder.itemParameterValue.setText(rooms.get(position).getLighting());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RoomItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemParameterName;
        TextView itemParameterValue;

        public RoomItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemParameterName = itemView.findViewById(R.id.itemParameterName);
            itemParameterValue = itemView.findViewById(R.id.itemParameterValue);

        }
    }
}

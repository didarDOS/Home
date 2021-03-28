package com.home.home.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;
import androidx.viewpager2.widget.ViewPager2;

import com.home.home.R;
import com.home.home.models.Rooms;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdaper extends RecyclerView.Adapter<SliderAdaper.SliderViewHolder> {

    private List<Rooms> sliderItems;
    private ViewPager2 viewPager2;

    public SliderAdaper(List<Rooms> sliderItems, ViewPager2 viewPager2) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item_container, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImageView(sliderItems.get(position));
    }

    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder {

        private RoundedImageView imageView;

        SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSlide);

        }

        void setImageView(Rooms sliderItem) {
            imageView.setImageResource(sliderItem.getImage());
        }
    }
}

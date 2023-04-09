package com.javacookies.springr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private List<Item> itemList; // list of data objects

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate a layout for each item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // get the data object for the current position
        Item item = itemList.get(position);
        // set the views with the data
        Glide.with(holder.getImageView().getContext()).load(item.getImageUri()).centerCrop().into(holder.getImageView());
        Glide.with(holder.getPfp().getContext()).load(item.getPfpUri()).centerCrop().into(holder.getPfp());
        holder.getUser().setText(item.getUser());
        holder.getTextView().setText(item.getDescription());
        holder.getButton().setText(item.isLiked() ? "Unlike" : "Like");
        // add a click listener to the button
        holder.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toggle the liked state of the item
                item.setLiked(!item.isLiked());
                // update the button text
                holder.getButton().setText(item.isLiked() ? "Unlike" : "Like");
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
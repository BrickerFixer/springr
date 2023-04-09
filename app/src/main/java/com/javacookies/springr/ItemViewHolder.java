package com.javacookies.springr;

import android.view.View;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// Define a ViewHolder class that holds the views for each item
public class ItemViewHolder extends RecyclerView.ViewHolder {
    private final ImageView pfp;
    private final TextView user;
    private ImageView imageView; // view for the image
    private TextView textView; // view for the description
    private Button button; // view for the like button

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.photo);
        textView = itemView.findViewById(R.id.header);
        button = itemView.findViewById(R.id.likebtt);
        pfp = itemView.findViewById(R.id.pfp);
        user = itemView.findViewById(R.id.user);
    }

    public Button getButton() {
        return button;
    }

    public TextView getTextView() {
        return textView;
    }

    public ImageView getPfp() {
        return pfp;
    }
    public TextView getUser() {
        return user;
    }

    public ImageView getImageView() {
        return imageView;
    }

    // getters and setters
}
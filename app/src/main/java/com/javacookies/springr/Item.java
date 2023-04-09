package com.javacookies.springr;

// Define a data class that represents each item
public class Item {
    private String imageUri; // resource id of the image
    private String description; // description text
    private boolean liked; // whether the item is liked or not
    private String pfpUri;
    private String user;

    public Item(String imageUri, String description, String pfpUri, String user, boolean liked) {
        this.imageUri = imageUri;
        this.description = description;
        this.liked = liked;
        this.pfpUri = pfpUri;
        this.user = user;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getPfpUri() {
        return pfpUri;
    }

    public String getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean b) {
        liked = b;
    }

    // getters and setters
}
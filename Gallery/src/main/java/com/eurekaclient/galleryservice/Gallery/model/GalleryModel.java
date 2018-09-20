package com.eurekaclient.galleryservice.Gallery.model;

import java.util.List;

public class GalleryModel {
    private int id;
    private List<Object> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}

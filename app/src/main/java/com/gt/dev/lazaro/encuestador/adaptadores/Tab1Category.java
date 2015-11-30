package com.gt.dev.lazaro.encuestador.adaptadores;

/**
 * Created by root on 24/11/15.
 */
public class Tab1Category {

    private String title;
    private int picture;

    public Tab1Category(String title, int picture) {
        this.title = title;
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}

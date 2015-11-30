package com.gt.dev.lazaro.encuestador.adaptadores;

/**
 * Created by root on 25/11/15.
 */
public class NewCategory {

    private String titleNew;
    private String subtitleNew;

    public NewCategory(String title, String subtitleNew) {
        this.titleNew = title;
        this.subtitleNew = subtitleNew;
    }

    public String getTitleNew() {
        return titleNew;
    }

    public void setTitleNew(String titleNew) {
        this.titleNew = titleNew;
    }

    public String getSubtitleNew() {
        return subtitleNew;
    }

    public void setSubtitleNew(String subtitleNew) {
        this.subtitleNew = subtitleNew;
    }
}

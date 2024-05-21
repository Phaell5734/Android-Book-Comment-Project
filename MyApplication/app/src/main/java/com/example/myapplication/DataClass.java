package com.example.myapplication;


import android.widget.RatingBar;

public class DataClass {
    private String dataTitle;
    private String dataDesc;
    private String dataLang;
    private String dataImage;
    private String dataWriter;

    public String getDataWriter() {
        return dataWriter;
    }


    public float getDataRating() {
        return dataRating;
    }

    private float dataRating;
    private String key;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getDataTitle() {
        return dataTitle;
    }
    public String getDataDesc() {
        return dataDesc;
    }
    public String getDataLang() {
        return dataLang;
    }
    public String getDataImage() {
        return dataImage;
    }
    public DataClass(String dataTitle, String dataDesc, String dataLang, String dataImage, String dataWriter, float dataRating) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
        this.dataWriter = dataWriter;
        this.dataRating = dataRating;
    }
    public DataClass(){
    }
}
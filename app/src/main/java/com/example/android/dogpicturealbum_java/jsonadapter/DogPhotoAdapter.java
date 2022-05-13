package com.example.android.dogpicturealbum_java.jsonadapter;

public class DogPhotoAdapter {
    private String message;
    private String status;

    //Getters
    public String getMessage(){
        return message;
    }

    public String getStatus(){
        return status;
    }

    //Setters
    public void setMessage(String imageUrl){
        this.message = imageUrl;
    }

    public void setStatus(String statusResponse){
        this.status = statusResponse;
    }
}

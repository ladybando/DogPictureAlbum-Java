package com.example.android.dogpicturealbum_java.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "dogImages")
public class PhotoEntity{
    @PrimaryKey
    private int id;
    private String imageUrl;
    private String status;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getImage(){
        return imageUrl;
    }

    public String getStatus(){
        return status;
    }
}

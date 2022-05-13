package com.example.android.dogpicturealbum_java.network;

import com.squareup.moshi.Json;

public class DogPhoto {
    static class DogPhotoData{
        @Json(name = "message") String imageUrl;
        @Json(name = "status") String statusResponse;
    }
}

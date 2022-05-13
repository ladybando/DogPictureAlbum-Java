package com.example.android.dogpicturealbum_java;

import com.example.android.dogpicturealbum_java.jsonadapter.DogPhotoAdapter;
import com.squareup.moshi.Moshi;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.GET;

public class DogPhotoApiService {
    static final String BASE_URL = "https://dog.ceo/api";

    private Moshi moshi  = new Moshi.Builder()
    .add(new DogPhotoAdapter())
    .build();

    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL)
            .build();
    DogPhotoApi api = retrofit.create(DogPhotoApi.class);
    Call<Void> photos = api.getRandomPhoto();
}
interface DogPhotoApi{
    @GET("breeds/image/random")
    Call<Void> getRandomPhoto();

}
package com.example.android.dogpicturealbum_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import android.os.Bundle;
import android.util.Log;

import com.example.android.dogpicturealbum_java.network.DogPhoto;
import com.example.android.dogpicturealbum_java.viewmodel.DogPhotoViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayDogPhoto();
    }

    public void displayDogPhoto(){
        DogPhotoViewModel viewModel = new DogPhotoViewModel();
        LiveData<DogPhoto> dogPhoto = viewModel.returnNewPhoto();
        System.out.println(dogPhoto);
        Log.d("MainAct", String.valueOf(dogPhoto));
    }
}
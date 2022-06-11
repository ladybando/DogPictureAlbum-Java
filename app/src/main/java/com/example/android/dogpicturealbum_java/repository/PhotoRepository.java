package com.example.android.dogpicturealbum_java.repository;

import androidx.lifecycle.LiveData;

import com.example.android.dogpicturealbum_java.network.DogPhoto;
//TODO https://github.com/android/architecture-components-samples/blob/master/BasicSample/app/src/main/java/com/example/android/persistence/DataRepository.java
//TODO https:/https://medium.com/@amtechnovation/android-architecture-component-mvvm-part-1-a2e7cff07a76/developer.android.com/codelabs/android-training-livedata-viewmodel?index=..%2F..%2Fandroid-training#7
//TODO
public class PhotoRepository {
    //member variable for dog photos to access in ViewModel
    LiveData<DogPhoto> dogPhotos;

    LiveData<DogPhoto> getAllPhotos(){
        return dogPhotos;
    }
}

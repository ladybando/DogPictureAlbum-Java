package com.example.android.dogpicturealbum_java.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.dogpicturealbum_java.network.DogPhoto;

public class DogPhotoViewModel extends ViewModel {

    private MutableLiveData<DogPhoto> dogPhoto;

    //return dog photo to use outside of class
    public LiveData<DogPhoto> returnNewPhoto(){
        return dogPhoto;
    }

}

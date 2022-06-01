package com.example.livedataprueba.viewmodel;

import android.app.SearchManager;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NameViewModel extends ViewModel {
    //Create a LiveData with a String
    public MutableLiveData<String> currentName;

    public NameViewModel() {
        this.currentName = new MutableLiveData<>();
    }

    public void pulsar(){
        currentName.setValue("Paula");
    }
}

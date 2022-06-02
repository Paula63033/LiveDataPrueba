package com.example.livedataprueba.viewmodel;

import android.app.SearchManager;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.livedataprueba.utils.PreferencesProvider;

public class NameViewModel extends ViewModel {
    //Create a LiveData with a String
    public MutableLiveData<String> currentName;
    //public MutableLiveData<String> currentName;
    //public MutableLiveData<String> currentName;

    public NameViewModel() {
        this.currentName = new MutableLiveData<>();
        this.currentName.setValue("HELLO WORLD!");
    }

    public void pulsar(){

        int numero = PreferencesProvider.providePreferences().getInt("numero",0);

        currentName.setValue("Paula " + numero);
    }
}

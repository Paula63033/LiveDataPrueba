package com.example.livedataprueba.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.livedataprueba.databinding.ContentMainBinding;

import com.example.livedataprueba.viewmodel.NameViewModel;

public class NameActivity extends AppCompatActivity {
    private NameViewModel model;
    private ContentMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ContentMainBinding.inflate(getLayoutInflater());

        //Get the ViewModel
        model = new ViewModelProvider(this).get(NameViewModel.class);


        /*
        //Create the observer which updates the UI
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                //Uptade the UI, in this case, a TextView
                nameTextView.setText(newName);
            }
        };

        //Observe the LiveData, passing in this activity as the LifecycleOwner and the observer
        model.getCurrentName().observe(this, nameObserver);

         */
    }

}

package com.example.livedataprueba.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.livedataprueba.R;
import com.example.livedataprueba.databinding.ContentMainBinding;

import com.example.livedataprueba.viewmodel.NameViewModel;

public class NameActivity extends AppCompatActivity {
    private NameViewModel viewmodel;
    private ContentMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ContentMainBinding.inflate(getLayoutInflater());

        // Set the Content of the xml to the view
        //TODO: @Didac. Necessites tenir el fitxer xml (la vista on hi ha botons, etc...) referenciat. Següent linea
        setContentView(binding.getRoot());

        //Get the ViewModel
        viewmodel = new ViewModelProvider(this).get(NameViewModel.class);

        //TODO @Didac. En aquesta funció li passem al binding el viewmodel que treballarà aquests mutables i li indiquem
        setup();


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

    //TODO @Didac. En aquesta funció li passem al binding el viewmodel que treballarà aquests mutables i li indiquem
    private void setup(){
        binding.setViewModel(viewmodel);
        binding.setLifecycleOwner(this);
    }

}

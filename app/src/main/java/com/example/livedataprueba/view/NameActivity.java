package com.example.livedataprueba.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.livedataprueba.databinding.ContentMainBinding;

import com.example.livedataprueba.viewmodel.NameViewModel;

public class NameActivity extends AppCompatActivity {

    private NameViewModel viewmodel;
    private ContentMainBinding binding;
    private String recuperatIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();

        recuperatIntent = extras.getString("opcio");

        binding = ContentMainBinding.inflate(getLayoutInflater());

        // Set the Content of the xml to the view
        //TODO: @Didac. Necessites tenir el fitxer xml (la vista on hi ha botons, etc...) referenciat. Següent linea
        setContentView(binding.getRoot());

        //Get the ViewModel
        viewmodel = new ViewModelProvider(this).get(NameViewModel.class);

        //TODO @Didac. En aquesta funció li passem al binding el viewmodel que treballarà aquests mutables i li indiquem
        setup();

        viewmodel.currentName.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(getApplicationContext(),"valor canviat " + recuperatIntent,Toast.LENGTH_LONG).show();
            }
        });

    }

    //TODO @Didac. En aquesta funció li passem al binding el viewmodel que treballarà aquests mutables i li indiquem
    private void setup(){
        binding.setViewModel(viewmodel);
        binding.setLifecycleOwner(this);
    }

}
package com.example.livedataprueba.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.livedataprueba.R;
import com.example.livedataprueba.utils.PreferencesProvider;
import android.widget.ShareActionProvider;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreferencesProvider.init(this);

        PreferencesProvider.providePreferences().edit().putInt("numero",69).commit();

    }

    public void boton(View v){
        Intent intent = new Intent(this, NameActivity.class);
        intent.putExtra("opcio", "jodete");
        startActivity(intent);
    }
}
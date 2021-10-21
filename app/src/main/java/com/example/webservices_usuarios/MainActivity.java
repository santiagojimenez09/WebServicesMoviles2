package com.example.webservices_usuarios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.escenario,new SesionFragment()).commit();


    }



}
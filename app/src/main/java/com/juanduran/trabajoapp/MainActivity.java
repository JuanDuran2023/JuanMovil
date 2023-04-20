package com.juanduran.trabajoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View view){
        Intent miIntent= null;
        switch (view.getId()){
            case  R.id.registrar:
             miIntent=new Intent(MainActivity.this,RegistroActivity.class);
             break;
            case R.id.recuperar:
                miIntent=new Intent(MainActivity.this,RecuperacionActivity3.class);
                break;
            case  R.id.tv_go_to_register:
                miIntent=new Intent(MainActivity.this,MenuActivity0.class);
                break;

        }
        startActivity(miIntent);
    }
}
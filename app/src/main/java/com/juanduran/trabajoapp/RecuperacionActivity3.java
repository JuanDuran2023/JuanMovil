package com.juanduran.trabajoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecuperacionActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperacion3);
    }
    public void onClick(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnvolver:
                miIntent=new Intent(RecuperacionActivity3.this,MainActivity.class);
                break;
            case R.id.enviarcod:
                miIntent=new  Intent(RecuperacionActivity3.this,recuperacionCODActivity4.class);
                break;


        }
        startActivity(miIntent);
    }

}
package com.juanduran.trabajoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class contenidobuscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenidobuscar);
        configureBackButton();
    }
    private void configureBackButton(){

        ImageButton backButtonJ =(ImageButton) findViewById(R.id.btn_volver);

        backButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
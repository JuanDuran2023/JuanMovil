package com.juanduran.trabajoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu0);
        configureNextButtonMenu();
    }

    private void configureNextButtonMenu() {
        ImageButton nextButton = (ImageButton) findViewById(R.id.btnhome);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity0.this, MenuActivity0.class));
            }
        });
        ImageButton nextButton2 = (ImageButton) findViewById(R.id.btncursos);
        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity0.this, CursosActivity.class));
            }

        });
        Button nextButton3 = (Button) findViewById(R.id.btnbuscar);
        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity0.this, BuscarActivity.class));
            }

        });
        Button nextButton4 = (Button) findViewById(R.id.notificaciones);
        nextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity0.this, Notificaciones.class));
            }

        });
    }
}
package com.juanduran.trabajoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BuscarActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        configureNextButton();
        configureNextButtonMenu();
    }

    private void configureNextButton(){

        Button nexButtonJ =(Button) findViewById(R.id.contendor1);

        nexButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,contenidobuscar.class));
            }
        });
        Button nexButton2 =(Button) findViewById(R.id.contendor2);

        nexButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,contenidobuscar.class));
            }
        });
        Button nexButton3 =(Button) findViewById(R.id.contendor3);

        nexButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,contenidobuscar.class));
            }
        });
        Button nexButton4 =(Button) findViewById(R.id.contendor4);

        nexButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,contenidobuscar.class));
            }
        });
        Button nexButton5=(Button) findViewById(R.id.contendor5);

        nexButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,contenidobuscar.class));
            }
        });
        Button nexButton6 =(Button) findViewById(R.id.contendor7);

        nexButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,contenidobuscar.class));
            }
        });

    }
    private void configureNextButtonMenu(){
        ImageButton nextButton=(ImageButton) findViewById(R.id.btnhome);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,MenuActivity0.class));
            }
        });
        ImageButton nextButton2=(ImageButton) findViewById(R.id.btncursos);
        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuscarActivity.this,CursosActivity.class));
            }
        });

    }


}
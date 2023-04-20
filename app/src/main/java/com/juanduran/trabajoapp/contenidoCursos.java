package com.juanduran.trabajoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

public class contenidoCursos extends AppCompatActivity implements View.OnClickListener {
    Button curso;

    private final static String GOOGLE_URL="https://edutin.com/curso-de-Mecanica-automotriz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido_cursos);
        configureNextButtonMenu();
        backButton();

        curso= findViewById(R.id.continuar);

        curso.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.continuar:
                intent.setData(Uri.parse(GOOGLE_URL));
                startActivity(intent);
                break;
        }
    }
    private void configureNextButtonMenu(){
        ImageButton nextButton=(ImageButton) findViewById(R.id.btnhome);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contenidoCursos.this,MenuActivity0.class));
            }
        });
        ImageButton nextButton2=(ImageButton) findViewById(R.id.btncursos);
        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contenidoCursos.this,CursosActivity.class));
            }
        });

    }
    private void backButton(){

        Button nextButton=(Button) findViewById(R.id.volver);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
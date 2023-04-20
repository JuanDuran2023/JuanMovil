package com.juanduran.trabajoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class recuperacionCODActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperacion_codactivity4);

        findViewById(R.id.btnuevocod).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                MostrarDialogos();

            }


        });


    }

    public void onClick(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnenviarcod:
                miIntent=new Intent(recuperacionCODActivity4.this,restaurarActivity5.class);
                break;

        }
        startActivity(miIntent);
    }






    private void MostrarDialogos() {

        AlertDialog.Builder builder = new AlertDialog.Builder(recuperacionCODActivity4.this);
        LayoutInflater inflanter = getLayoutInflater();
        View view = inflanter.inflate(R.layout.cuadro_codigo, null);
        builder.setView(view);
        AlertDialog dialogo = builder.create();
        dialogo.show();
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        TextView txt = view.findViewById(R.id.exitoso);
        txt.setText("Nuevo código enviado.");
        Button btn_next = view.findViewById(R.id.btnmenu);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vew) {
                Toast.makeText(getApplicationContext(), "Ingrese código", Toast.LENGTH_SHORT).show();
                dialogo.dismiss();
            }
        });

    }
}
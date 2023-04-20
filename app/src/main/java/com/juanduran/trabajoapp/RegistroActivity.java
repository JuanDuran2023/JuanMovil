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

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        findViewById(R.id.btncrearcuenta).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                MostrarDialogos();

            }


        });


    }

    public void OnClick(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnvolver:
                miIntent=new Intent(RegistroActivity.this,MainActivity.class);


        }
        startActivity(miIntent);
    }

    private void MostrarDialogos() {

        AlertDialog.Builder builder = new AlertDialog.Builder(RegistroActivity.this);
        LayoutInflater inflanter = getLayoutInflater();
        View view = inflanter.inflate(R.layout.cuadro_dialogo, null);
        builder.setView(view);
        AlertDialog dialogo = builder.create();
        dialogo.show();
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        TextView txt = view.findViewById(R.id.exitoso);
        txt.setText("Registro exitoso");
        Button btn_next = view.findViewById(R.id.btnmenu);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vew) {
                Toast.makeText(getApplicationContext(), "Volver a iniciar sesión", Toast.LENGTH_SHORT).show();
                dialogo.dismiss();
            }
        });

    }


}
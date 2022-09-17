package com.example.guia01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AnioBisiesto extends AppCompatActivity {

    private EditText edtAnioBisiesto;
    private Button btnCalcularAnio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anio_bisiesto);

        edtAnioBisiesto = findViewById(R.id.edtAnioBisiesto);
        btnCalcularAnio = findViewById(R.id.btnCalcularAnio);

        btnCalcularAnio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int anio = Integer.parseInt(edtAnioBisiesto.getText().toString());
                anioBisiesto(anio);
            }
        });

    }

    private void anioBisiesto(int anio){
        if((anio % 4 == 0) && (anio % 100 != 0)){
            new AlertDialog.Builder(this).setTitle("Resultado").setMessage("El año " + String.valueOf(anio) + " es bisiesto")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).show();
        }else if((anio % 100 == 00) && (anio % 400 == 0)){
            new AlertDialog.Builder(this).setTitle("Resultado").setMessage("El año " + String.valueOf(anio) + " es bisiesto")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).show();
        }else if((anio % 4 == 0) && (anio % 400 ==0)){
            new AlertDialog.Builder(this).setTitle("Resultado").setMessage("El año " + String.valueOf(anio) + " es bisiesto")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).show();
        }else{
            new AlertDialog.Builder(this).setTitle("Resultado").setMessage("El año " + String.valueOf(anio) + " no es bisiesto")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).show();
        }
    }
}
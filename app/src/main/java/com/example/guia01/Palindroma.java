package com.example.guia01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Palindroma extends AppCompatActivity {

    private EditText edtPalabara;
    private Button btnCalcularPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindroma);

        edtPalabara = findViewById(R.id.edtPalabra);
        btnCalcularPalabra = findViewById(R.id.btnCalcularPalabra);

        btnCalcularPalabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String palabra = edtPalabara.getText().toString();
                if(palabra.isEmpty()){
                    edtPalabara.setError("Este campo no puede estar vacio");
                    mensajeVacio();
                }else{
                    esPalindroma(palabra);
                }
            }
        });
    }

    public void esPalindroma(String palabra){
        palabra = palabra.toLowerCase();
        String palIvertida = new StringBuilder(palabra).reverse().toString();

        if(palIvertida.equals(palabra)){
            new AlertDialog.Builder(this).setTitle("Resultado").setMessage("La palabra: " + palabra + " es palíndroma")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).show();
        }else{
            new AlertDialog.Builder(this).setTitle("Resultado").setMessage("La palabra: " + palabra + " no es palíndroma")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    }).show();
        }
    }

    public void mensajeVacio(){
        new AlertDialog.Builder(this).setTitle("¡Advertencia!").setMessage("Debe escribir una palabra")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        //finish();
                    }
                }).show();
    }
}
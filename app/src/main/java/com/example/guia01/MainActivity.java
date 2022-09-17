package com.example.guia01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMultiplicacion;
    private Button btnBisiesto;
    private  Button btnPalindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnBisiesto = findViewById(R.id.btnBisiesto);
        btnPalindrome = findViewById(R.id.btnPalindrome);

        btnMultiplicacion.setOnClickListener(view -> {

            startActivity(new Intent(this, MultiplicacionRusaActivity.class));

        });

        btnBisiesto.setOnClickListener(view -> {
            startActivity(new Intent(this, AnioBisiesto.class));
        });

        btnPalindrome.setOnClickListener(view -> {
            startActivity(new Intent(this, Palindroma.class));
        });
    }
}
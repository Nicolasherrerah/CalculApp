package com.example.calculapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int a=60;
int b=20;
int suma;
int resta;
int div;
int mult;
EditText userText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Etiquetas","Entró");
        Toast.makeText( userText(), Toast.LENGTH_SHORT).show();
        suma= a+b;
        resta= a-b;
        div= a/b;
        mult=a*b;

        System.out.println("Suma de dos numeros " + suma);
        System.out.println("Resta de dos numeros " + resta);
        System.out.println("Division de dos numeros " + div);
        System.out.println("Multiplicacion de dos numeros " + mult);
    }
}

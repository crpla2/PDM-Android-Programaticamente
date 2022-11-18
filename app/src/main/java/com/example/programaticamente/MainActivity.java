package com.example.programaticamente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.time.Clock;


public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout=findViewById(R.id.linearLayout);
        recorrer();
    }

    /**
     * Metodo para recorrer el layout er imprimir por consola los hijos que tiene
     */
    public void recorrer(){
        View view;
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
           view=linearLayout.getChildAt(i);
           System.out.println("Objeto: "+view.toString());
        }
    }
}
package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    Button h_aparta;
    Button h_sencilla;
    Button cerrar7;
    Button menu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        h_aparta=(Button)findViewById(R.id.h_aparta);
        h_aparta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity9.this, MainActivity10.class);
                startActivity(i);
            }
        });

        h_sencilla=(Button)findViewById(R.id.h_sencilla);
        h_sencilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity9.this, MainActivity11.class);
                startActivity(i);
            }
        });

        cerrar7=(Button)findViewById(R.id.cerrar7);
        cerrar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity9.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu6=(Button)findViewById(R.id.menu6);
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity9.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}
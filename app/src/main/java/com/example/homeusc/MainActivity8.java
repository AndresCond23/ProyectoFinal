package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    Button cerrar6;
    Button menu5;
    Button volver3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        cerrar6=(Button)findViewById(R.id.cerrar6);
        cerrar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity8.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu5=(Button)findViewById(R.id.menu5);
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity8.this, MainActivity2.class);
                startActivity(i);
            }
        });

        volver3=(Button)findViewById(R.id.volver3);
        volver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity8.this, MainActivity6.class);
                startActivity(i);
            }
        });

    }
}
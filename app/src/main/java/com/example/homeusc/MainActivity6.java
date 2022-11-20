package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button c_villa;
    Button c_lago;
    Button cerrar4;
    Button menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        c_villa=(Button)findViewById(R.id.c_villa);
        c_villa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(i);
            }
        });

        c_lago=(Button)findViewById(R.id.c_lago);
        c_lago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity8.class);
                startActivity(i);
            }
        });

        cerrar4=(Button)findViewById(R.id.cerrar4);
        cerrar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu3=(Button)findViewById(R.id.menu3);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity2.class);
                startActivity(i);
            }
        });

    }
}
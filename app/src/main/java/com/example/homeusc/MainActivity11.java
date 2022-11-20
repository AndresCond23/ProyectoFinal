package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    Button cerrar8;
    Button menu8;
    Button volver4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        cerrar8=(Button)findViewById(R.id.cerrar8);
        cerrar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity11.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu8=(Button)findViewById(R.id.menu8);
        menu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity11.this, MainActivity2.class);
                startActivity(i);
            }
        });

        volver4=(Button)findViewById(R.id.volver4);
        volver4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity11.this, MainActivity9.class);
                startActivity(i);
            }
        });
    }
}
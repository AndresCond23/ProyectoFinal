package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    Button cerrar8;
    Button menu7;
    Button volver5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        cerrar8=(Button)findViewById(R.id.cerrar8);
        cerrar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity10.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu7=(Button)findViewById(R.id.menu7);
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity10.this, MainActivity2.class);
                startActivity(i);
            }
        });

        volver5=(Button)findViewById(R.id.volver5);
        volver5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity10.this, MainActivity9.class);
                startActivity(i);
            }
        });
    }
}
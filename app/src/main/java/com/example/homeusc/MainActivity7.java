package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    Button cerrar5;
    Button menu4;
    Button volver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        cerrar5=(Button)findViewById(R.id.cerrar5);
        cerrar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu4=(Button)findViewById(R.id.menu4);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity2.class);
                startActivity(i);
            }
        });

        volver2=(Button)findViewById(R.id.volver2);
        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(i);
            }
        });
    }
}
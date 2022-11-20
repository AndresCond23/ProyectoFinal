package com.example.homeusc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button cerrar3;
    Button menu2;
    Button volver1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        cerrar3=(Button)findViewById(R.id.cerrar3);
        cerrar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(i);
            }
        });

        menu2=(Button)findViewById(R.id.menu2);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity2.class);
                startActivity(i);
            }
        });

        volver1=(Button)findViewById(R.id.volver1);
        volver1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(i);
            }
        });
    }
}
package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button b1=findViewById(R.id.cse);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b2=findViewById(R.id.ece);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b3=findViewById(R.id.mech);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b4=findViewById(R.id.civil);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b5=findViewById(R.id.eee);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b6=findViewById(R.id.it);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity6.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
    }
}

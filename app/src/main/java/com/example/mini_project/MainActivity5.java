package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button b1=findViewById(R.id.vitut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity5.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b2=findViewById(R.id.pdf);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity5.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
        Button b3=findViewById(R.id.free);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity5.this,Video_Cse.class);
                startActivityForResult(i,0);
            }
        });
    }
}

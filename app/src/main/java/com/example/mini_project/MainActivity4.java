package com.example.mini_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button cse,ece,civil,eee,mech,it;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        cse=findViewById(R.id.cse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity4.this,cgpa_calculator.class);
                startActivity(ii);
                finish();
            }
        });
        ece=findViewById(R.id.ece);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity4.this,cgpa_calculator.class);
                startActivity(ii);
                finish();
            }
        });
        eee=findViewById(R.id.eee);
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity4.this,cgpa_calculator.class);
                startActivity(ii);
                finish();
            }
        });
        civil=findViewById(R.id.civil);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity4.this,cgpa_calculator.class);
                startActivity(ii);
                finish();
            }
        });
        it=findViewById(R.id.it);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity4.this,cgpa_calculator.class);
                startActivity(ii);
                finish();
            }
        });
        mech=findViewById(R.id.mech);
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity4.this,cgpa_calculator.class);
                startActivity(ii);
                finish();
            }
        });
    }
}

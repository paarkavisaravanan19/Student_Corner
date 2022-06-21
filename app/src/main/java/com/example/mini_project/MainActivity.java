package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText roll=findViewById(R.id.rollno);
        EditText bday=findViewById(R.id.dob);
        Spinner sp=findViewById(R.id.year);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.clg_year,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp.setAdapter(adapter);

        Spinner sp1=findViewById(R.id.dept);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.clg_dept,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp1.setAdapter(adapter1);

        Button log=findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(roll.getText()) && TextUtils.isEmpty(bday.getText()) && sp.getSelectedItemPosition()==1 && sp1.getSelectedItemPosition()==1) {
                    Toast.makeText(MainActivity.this, "Enter all credentials", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivityForResult(i, 0);
                }
            }
        });
    }
}
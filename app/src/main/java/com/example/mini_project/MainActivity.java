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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        Pattern p=Pattern.compile("^([0-9]{2})(^[a-z]{2,3})(^[0-9]{3})$");
        Matcher m=p.matcher(roll.getText().toString());

        Pattern p1=Pattern.compile("^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$" );
        Matcher m1=p1.matcher(bday.getText().toString());
        Button log=findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(roll.getText()) || !TextUtils.isEmpty(bday.getText()) || sp.getSelectedItemPosition()!=0 || sp1.getSelectedItemPosition()!=0) {
                    if (roll.getText().toString().length() == 8 || m.find()) {
                        if(bday.getText().toString().length()==10) {
                            Intent i = new Intent(MainActivity.this, MainActivity2.class);
                            startActivityForResult(i, 0);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Enter valid Date of birth", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Enter valid roll number", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Enter all credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
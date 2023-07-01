package com.example.collegetimetableminiproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class student extends AppCompatActivity {
EditText usn,sec;
Button s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    usn=findViewById(R.id.usn);
    sec=findViewById(R.id.section);
    s=findViewById(R.id.submit);

    s.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s1=usn.getText().toString();
            String s2=sec.getText().toString();
         if(s1.equals("sumukh")) {

             if(s2.equals("d")) {
                 Intent it = new Intent(student.this, timeTable.class);
                 startActivity(it);
             }
         }else{

             Toast.makeText(student.this, "invalid credentials", Toast.LENGTH_LONG).show();
             usn.setText("");
             sec.setText("");
         }


        }
    });
    }
}
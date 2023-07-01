package com.example.collegetimetableminiproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class teacherTable extends AppCompatActivity {
RadioGroup rg;
TextView t;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_table);
        rg = findViewById(R.id.mnr1);
        t = findViewById(R.id.tmon1);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if(checkedId == R.id.r1)
//                {
//                  t.setTextColor(Color.GREEN);
//                  Intent intent = new Intent(teacherTable.this, timeTable.class);
//                  intent.putExtra("arg", t.getText().toString()); // getText() SHOULD NOT be static!!!
//                  startActivityForResult(intent , 1);
//              }else if(checkedId == R.id.r2)
//               {
//                   t.setTextColor(Color.RED);
//               }else{
//                   t.setTextColor(Color.GREEN);
//                   Intent intent = new Intent(teacherTable.this, timeTable.class);
//                   intent.putExtra("arg", t.getText().toString()); // getText() SHOULD NOT be static!!!
//                  startActivityForResult(intent , 1);
//                }



            }
        });

    }
}
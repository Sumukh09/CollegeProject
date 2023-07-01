package com.example.collegetimetableminiproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class timeTable extends AppCompatActivity {

    Button b1 , b2, b3;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);



        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        t1 = findViewById(R.id.mon1);

        String passedArg = getIntent().getExtras().getString("arg");
     if(passedArg == null)
     {
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
//                 Intent intent = new Intent();
//                 intent.setAction(Intent.ACTION_VIEW);
//                 intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                 intent.setData(Uri.parse("http://guru.nmamit.in"));
//                 startActivity(intent);


             }
         });

     }
     else
    t1.setText(passedArg);



    }
}
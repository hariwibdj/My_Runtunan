package com.example.myruntunan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void coba1(View view){
        final TextView label1 = findViewById(R.id.label1);
        String nama ="Deny ";
        label1.setText("S1-Teknik Informatika"+" "+nama+" "+"Darmajaya");
    }
}
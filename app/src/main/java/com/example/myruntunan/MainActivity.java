package com.example.myruntunan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView var = findViewById(R.id.var);
        var.setText("Teknik Informatika");
    }

    public void activ2(View view){
        Intent activit2 = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(activit2);
    }

    public void activ3  (View view){
        Intent activit3 = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(activit3);
    }
}
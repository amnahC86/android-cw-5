package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name = findViewById(R.id.textView);
        TextView age2 = findViewById(R.id.textView2);
        Bundle airport = getIntent().getExtras();
        String bag = airport.getString( "info");
        String bag2 = airport.getString("info2");
        age2.setText(bag2);
        name.setText(bag);
    }
}
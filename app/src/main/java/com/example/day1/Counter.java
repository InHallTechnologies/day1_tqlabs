package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Counter extends AppCompatActivity {
    TextView counterValueTextView;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        counterValueTextView = findViewById(R.id.counter_value_text_view);
    }


    public void addValue(View view) {
        counter++;
        counterValueTextView.setText(Integer.toString(counter));
    }

    public void reduceValue(View view) {
        counter--;
        counterValueTextView.setText(Integer.toString(counter));
    }
}
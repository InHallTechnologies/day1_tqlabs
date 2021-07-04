package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    Button button;
    Button changeName;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.name);
        textView2 = findViewById(R.id.name1);
        button = findViewById(R.id.button);
        changeName = findViewById(R.id.button_one);
        editText = findViewById(R.id.my_edit_text);


        changeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();
                if (a.equals("")){
                    Toast.makeText(MainActivity.this, "Enter something", Toast.LENGTH_SHORT).show();
                }else {
                    textView2.setText(a);
                }

            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, Counter.class);
                startActivity(intent);
                return true;
            }
        });

    }
}

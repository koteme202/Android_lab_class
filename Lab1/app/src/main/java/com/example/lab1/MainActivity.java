package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView ftxt;
    EditText name_edit1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ftxt = findViewById(R.id.textview1);
        name_edit1 = findViewById(R.id.fname_edit);
        btn1 = findViewById(R.id.savebtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = name_edit1.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please enter your name",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Welcome " + name,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
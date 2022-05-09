package com.sandhujj.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clickButton;
    int count = 0;
    TextView displayMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton = findViewById(R.id.clicker);
        displayMessage = findViewById(R.id.greeting);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Hi Dad!");
                Log.i("clickResponse","i love CS");
                displayMessage.setText(""+(++count));

            }
        });
    }

    public void reduce(View view) {
        displayMessage.setText(""+(--count));
    }
}
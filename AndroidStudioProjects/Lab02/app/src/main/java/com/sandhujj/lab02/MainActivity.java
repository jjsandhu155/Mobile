package com.sandhujj.lab02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button submit_name, shifter;
    EditText ui;
    TextView disp, shifted;
    String s,z;
    String[] arr, newArr;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit_name = findViewById(R.id.submission);
        ui = findViewById(R.id.user_in);
        disp = findViewById(R.id.display);
        shifter = findViewById(R.id.shifter);
        shifted = findViewById(R.id.shifted);
        ui.selectAll();
        arr = getResources().getStringArray(R.array.saideep);
        submit_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ui.getText() != null) {
                    s = ui.getText().toString();
                    newArr = new String[arr.length+1];
                    for (int i = 0; i < arr.length; i++) {
                        newArr[i] = arr[i];
                    }
                    newArr[arr.length]=s;
                    disp.setText(s);
                }
            }
        });
        shifter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count < newArr.length) {
                    shifted.setText(newArr[count]);
                    count++;
                    }
                else{
                    count = 0;
                    shifted.setText(newArr[count]);
                    count++;
                }
                }

        });
    }
}
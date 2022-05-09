package com.sandhujj.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tLeft, tRight, bLeft, bRight;
    SharedPreferences spef;
    SharedPreferences.Editor edit;
    SeekBar seeker;
    int z;
    boolean isClickedDummy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tLeft = findViewById(R.id.top_left);
        tRight = findViewById(R.id.top_right);
        bLeft = findViewById(R.id.bottom_left);
        bRight = findViewById(R.id.bottom_right);
        seeker = findViewById(R.id.my_bar);
        tLeft.setOnClickListener(this);
        tRight.setOnClickListener(this);
        bLeft.setOnClickListener(this);
        bRight.setOnClickListener(this);
        spef = getSharedPreferences("Values",MODE_PRIVATE);
        edit = spef.edit();
        isClickedDummy=true;
        z = 0;
        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    fontSize(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"thing",Toast.LENGTH_LONG);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"thing2",Toast.LENGTH_LONG);
            }
        });
        setInitialValues();
    }
    private void fontSize(int progress){
        tLeft.setTextSize(progress);
        tRight.setTextSize(progress);
        bLeft.setTextSize(progress);
        bRight.setTextSize(progress);

    }
    private void setInitialValues() {
        tLeft.setText(""+spef.getInt("topleft",0));
        tRight.setText(""+spef.getInt("topright",0));
        bLeft.setText(""+spef.getInt("bottomleft",0));
        bRight.setText(""+spef.getInt("bottomright",0));
    }

    @Override
    public void onClick(View view) {
        Button b = (Button)view;
        b.setText("" + (Integer.parseInt(b.getText().toString())+1));
        if(isClickedDummy) {
            view.setBackgroundColor(Color.parseColor("#FF0000"));
            isClickedDummy = false;
        } else {
            view.setBackgroundColor(Color.parseColor("#FFFFFF"));
            isClickedDummy = true;
        }
        storeValues();
    }

    private void storeValues() {
        edit.putInt("topleft",Integer.parseInt(tLeft.getText().toString()));
        edit.putInt("topright",Integer.parseInt(tRight.getText().toString()));
        edit.putInt("bottomleft",Integer.parseInt(bLeft.getText().toString()));
        edit.putInt("bottomright",Integer.parseInt(bRight.getText().toString()));
        edit.apply();
    }

}



/*
    Seekbar --- Changes Font for The Buttons
    4 Buttons Are Clickers

   Create Buttons
   implements View On Click Listener

   onClick is for the

   storeValues()
   putInt("left" left text)
 */
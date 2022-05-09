package com.sandhujj.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedprefs;
    SharedPreferences.Editor edit;
    TextView one, two, three, four, five, six, seven, onea, twoa, threea, foura, fivea, sixa, sevena;
    Button reset;
    int onCreateCounter = 0;
    int onResumeCounter = 0;
    int onPauseCounter = 0;
    int onStartCounter = 0;
    int onStopCounter = 0;
    int onRestartCounter = 0;
    int onDestroyCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedprefs = getSharedPreferences("Values",MODE_PRIVATE);
        reset = findViewById(R.id.reset);

        edit = sharedprefs.edit();
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        onea=findViewById(R.id.eight);
        twoa=findViewById(R.id.nine);
        threea=findViewById(R.id.ten);
        foura=findViewById(R.id.eleven);
        fivea=findViewById(R.id.twelve);
        sixa=findViewById(R.id.thirteen);
        sevena=findViewById(R.id.fourteen);
        onCreateCounter++;
        edit.putInt("onCreate", sharedprefs.getInt("onCreate", 0) + 1);
        updateValues();

    }



    @Override
    protected void onPause() {
        super.onPause();
        onPauseCounter++;
        onCreateCounter++;
        edit.putInt("onPause", sharedprefs.getInt("onPause", 0) + 1);
        updateValues();


    }

    @Override
    protected void onStart() {
        super.onStart();
        onStartCounter++;
        onCreateCounter++;
        edit.putInt("onStart", sharedprefs.getInt("onStart", 0) + 1);
        updateValues();
    }

    @Override
    protected void onResume() {
        super.onResume();
        onResumeCounter++;
        onCreateCounter++;
        edit.putInt("onResume", sharedprefs.getInt("onResume", 0) + 1);
        updateValues();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        onResumeCounter++;
        onCreateCounter++;
        edit.putInt("onRestart", sharedprefs.getInt("onRestart", 0) + 1);
        updateValues();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onDestroyCounter++;
        onCreateCounter++;
        edit.putInt("onDestroy", sharedprefs.getInt("onDestroy", 0) + 1);
        updateValues();
    }

    @Override
    protected void onStop() {
        super.onStop();
        onStopCounter++;
        onCreateCounter++;
        edit.putInt("onStop", sharedprefs.getInt("onStop", 0) + 1);
        updateValues();
    }

    private void updateValues(){
        one.setText("Lifetime onPause " + onPauseCounter);
        two.setText("Lieftime onStart " + onStartCounter);
        three.setText("Lifetime onResume " + onResumeCounter);
        four.setText("Lifetime onRestart " + onRestartCounter );
        five.setText("Lifetime onDestroy " + onDestroyCounter );
        six.setText("Lifetime onStop " + onStopCounter);
        six.setText("Lifetime onCreate " + onCreateCounter);
        onea.setText("Local onPause: "+sharedprefs.getInt("onPause", 0));
        twoa.setText("Local onStart: "+sharedprefs.getInt("onStart",0));
        threea.setText("Local onResume "+sharedprefs.getInt("onResume",0));
        foura.setText("Local onRestart "+sharedprefs.getInt("onRestart",0));
        fivea.setText("Local onDestroy "+sharedprefs.getInt("onDestroy",0));
        sixa.setText("Local onStop: "+sharedprefs.getInt("onStop",0));
        sevena.setText("Local onCreate: "+sharedprefs.getInt("onCreate",0));
    }
}




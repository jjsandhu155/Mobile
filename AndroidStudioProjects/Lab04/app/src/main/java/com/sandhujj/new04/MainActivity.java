package com.sandhujj.new04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    int[] arr = new int[]{R.layout.views,R.layout.triple_view,R.layout.multi,R.layout.overlappy,R.layout.scroller,R.layout.side_scroll,R.layout.fina};
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side_scroll);
    }
    @Override
    public void onClick(View view)
    {
        change_layout();
        x+=1;
    }
    public void onClick2(View view)
    {
        change_layout2();
        x-=1;
    }
    public void change_layout()
    {
        if (x>-1 && x<7)
            setContentView(arr[x]);
        else
        {
            x = 0;
            setContentView(arr[x]);
        }
    }
    public void change_layout2()
    {
        if (x > -1 && x < 7)
            setContentView(arr[x]);
        else
        {
            x = 6;
            setContentView(arr[x]);
        }
    }
}
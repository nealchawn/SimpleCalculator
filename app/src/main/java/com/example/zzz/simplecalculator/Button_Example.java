package com.example.zzz.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Button_Example extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_example);
        final Button button1 = (Button)findViewById(R.id.Button01);
        final Button button2 = (Button)findViewById(R.id.Button02);
        final Button button3 = (Button)findViewById(R.id.Button03);
        final Button button4 = (Button)findViewById(R.id.Button04);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked Button 1", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setFocusable(false);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked button 2",Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked button 3",Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked Button 4", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    Toast.makeText(getApplicationContext(),"Has Focus",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Lost Focus",Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"You long pressed button 4",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }


}

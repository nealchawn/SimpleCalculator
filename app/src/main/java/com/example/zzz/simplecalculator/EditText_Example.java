package com.example.zzz.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditText_Example extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edittext_example);
        final EditText numsOnlyText = (EditText)findViewById(R.id.txtNumOnly);
        final EditText multiLineText = (EditText)findViewById(R.id.txtMulti);
        final EditText phoneText = (EditText) findViewById(R.id.txtPhone);
        final Button okButton = (Button)findViewById(R.id.buttonTextOk);
        final TextView resultText = (TextView)findViewById(R.id.txtTextOut);
        //alternative way to define the function onclick outside the call non javascript style
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String results = "";
                results = "txtNum: "+numsOnlyText.getText().toString() + "\n";
                results += "txtMulti: "+multiLineText.getText().toString() + "\n";
                results += "txtPhone: "+phoneText.getText().toString() + "\n";
                resultText.setText(results);
            }
        });
    }

}

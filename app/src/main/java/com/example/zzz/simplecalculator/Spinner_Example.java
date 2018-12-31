package com.example.zzz.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Spinner_Example extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_example);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner01);
        final Button spinBtn = (Button)findViewById(R.id.btnSpinOk);
        final TextView results = (TextView)findViewById(R.id.txtSpinOut);

        String[] items = new String[] {"TextView", "Button","RadioButton",
                            "Spinner","CheckBox","EditText","WebView"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                result = "Selected Item Text: "+spinner.getSelectedItem().toString() +"\n"
                        +"Index: " + spinner.getSelectedItemPosition() + "\n";
                results.setText(result);
            }
        });
    }
}

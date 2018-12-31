package com.example.zzz.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Check_Box_Radio_Example extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_radio_example);
        //button group 1 only need one from each group
        final RadioButton rdbtn1 = (RadioButton)findViewById(R.id.rd01);
        //final RadioButton rdbtn2 = (RadioButton)findViewById(R.id.rd02);
        //button group 2 only need one from each group
        final RadioButton rdbtn3 = (RadioButton)findViewById(R.id.rd03);
        //final RadioButton rdbtn4 = (RadioButton)findViewById(R.id.rd04);

        final CheckBox chkBox1 = (CheckBox)findViewById(R.id.chk01);
        final CheckBox chkBox2 = (CheckBox)findViewById(R.id.chk02);
        final ToggleButton btnToggle = (ToggleButton)findViewById(R.id.btnToggle);
        final Button btnOk = (Button)findViewById(R.id.btnCheckOk);
        final TextView results = (TextView)findViewById(R.id.txtCheckOut);

        chkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                if(chkBox2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT);
                }else{
                    Toast.makeText(getApplicationContext(),"Not Check", Toast.LENGTH_SHORT);
                }
                 **/
                Toast.makeText(getApplicationContext(),"Check Box 2 is "+(chkBox2.isChecked() ?
                        " Checked" : "Not Checked")+"!",Toast.LENGTH_SHORT).show();
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";

                result += chkBox1.isChecked() ? "CheckBox 1 is Checked" : "CheckBox 1 is Not Checked";
                result += "\n";
                if(rdbtn1.isChecked()){
                    result += "Radio Button Group 1, Button 1 is Selected";
                }else{
                    result += "Radio Button Group 1, Button 2 is Selected";
                }
                result += "\n";
                if(rdbtn3.isChecked()) {
                    result += "Radio Button Group 2, Button 1 is Selected";
                }else {
                    result += "Radio Button Group 2, Button 2 is Selected";
                }
                results.setText(result);
            }
        });
    }
}

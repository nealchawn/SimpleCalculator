package com.example.zzz.simplecalculator;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    String[] GUIExamples = {
            "Buttons",
            "EditText and TextView",
            "CheckBox and RadioButtons",
            "Spinner (Dropdown)",
            "WebView"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, GUIExamples));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        switch(position){
            case 0:
                startActivity(new Intent(this, Button_Example.class));
                break;
            case 1:
                startActivity(new Intent(this, EditText_Example.class));
                break;
            case 2:
                startActivity(new Intent(this, Check_Box_Radio_Example.class));
                break;
            case 3:
                startActivity(new Intent(this, Spinner_Example.class));
                break;
            case 4:
                startActivity(new Intent(this, WebView_Example.class));
                break;
        }
    }
}

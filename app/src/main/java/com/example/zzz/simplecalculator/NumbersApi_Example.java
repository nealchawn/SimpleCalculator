package com.example.zzz.simplecalculator;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NumbersApi_Example extends Activity {
    //private  ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbersapi_example);


        //final EditText numberIn = (EditText)findViewById(R.id.editTextNumbersApi);
        final Button numberBtnOk = (Button)findViewById(R.id.btnNumbersApiOk);
        //final TextView results = (TextView)findViewById(R.id.txtNumbersApiOut);

        //RequestQueue queue = Volley.newRequestQueue(this);

        numberBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String number = numberIn.getText().toString();
                //String url = "http://numbersapi.com/"+number;

                new GetClass(getApplicationContext()).execute();

            }
        });
    }

    //test stuff
    private class GetClass extends AsyncTask<String, Void, Void> {
     private final Context context;
        public GetClass(Context c){
            this.context = c;
        }
        /**
    protected void onPreExecute(){
        progress = new ProgressDialog(this.context);
        progress.setMessage("Loading");
        progress.show();
    }
         **/
    @Override
    protected Void doInBackground(String... params) {
        try {
            final EditText numberIn = (EditText)findViewById(R.id.editTextNumbersApi);
            final TextView outputView = (TextView)findViewById(R.id.txtNumbersApiOut);
            String number = numberIn.getText().toString();

            URL url = new URL("http://numbersapi.com/"+number);

            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            //String urlParameters = "fizz=buzz";
            connection.setRequestMethod("GET");
            connection.setRequestProperty("USER-AGENT","Mozilla/5.0");
            connection.setRequestProperty("ACCEPT-LANGUAGE","en-US,en;0.5");
            int responseCode = connection.getResponseCode();
            final StringBuilder output = new StringBuilder("Request URL " + url);
            output.append(System.getProperty("line.separator") + "Response Code" + responseCode);
            output.append(System.getProperty("line.separator") + "Type" +"GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            StringBuilder responseOutput = new StringBuilder();
            System.out.println("output===============" + br);
            while((line = br.readLine()) != null ) {
                responseOutput.append(line);
            }
            br.close();
            output.append(System.getProperty("line.separator") +"Response" + System.getProperty("line.separator") + System.getProperty("line.separator") + responseOutput.toString());
            NumbersApi_Example.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    outputView.setText(output);
                    //progress.dismiss();
                }
            });
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block<br />
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block<br />
                e.printStackTrace();
            }
            return null;
            }
    }
}

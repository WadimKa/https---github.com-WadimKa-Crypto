package com.example.wadimka.crypto;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by WadimKa on 05.02.2016.
 */
public class MainActivity extends Activity {
    String path="";
    public static EditText edtForIO, edtCodeWord;
    public static TextView placeForText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_lat);

        edtCodeWord = (EditText) findViewById(R.id.edtCodeWord);
        edtForIO = (EditText) findViewById(R.id.edtForIO);
        placeForText = (TextView) findViewById(R.id.textViewForText);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOpen:
               // placeForText.setText(ClassForIO.readFromFile(edtRead.getText().toString()));
                path=edtForIO.getText().toString();
                HelpForwrad helpForwrad = new HelpForwrad();
                helpForwrad.execute();
                break;
            case R.id.btnSave:
                ClassForIO.writeInFile(edtForIO.getText().toString(), placeForText.getText().toString());
                break;
            case R.id.btnEncode:
                String text = placeForText.getText().toString();
                placeForText.setText(CodeN.codedToNumeral(text));
                break;
            case R.id.btnDecode:
                placeForText.setText( CodeN.decodedFromNumeral(placeForText.getText().toString()) );
                break;
        }
    }


    class HelpForwrad extends AsyncTask
    {
        String retData = "";

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            placeForText.setText(retData);
        }

        @Override
        protected Object doInBackground(Object[] params) {
            retData=ClassForIO.readFromFile(path);
            return null;
        }
    }
}
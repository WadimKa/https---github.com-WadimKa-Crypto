package com.example.wadimka.crypto;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by WadimKa on 05.02.2016.
 */
public class MainActivity extends Activity {
    int indikator =0;
    String path="", text="";
    public static EditText edtForIO, edtCodeWord,placeForText;
    //public static TextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_lat);

        edtCodeWord = (EditText) findViewById(R.id.edtCodeWord);
        edtForIO = (EditText) findViewById(R.id.edtForIO);
        placeForText = (EditText) findViewById(R.id.textViewForText);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOpen:
                path=edtForIO.getText().toString();
                indikator=0;
                HelpForwrad helpForwrad = new HelpForwrad();
                helpForwrad.execute();
                break;
            case R.id.btnSave:
                path=edtForIO.getText().toString();
                indikator=1;
                text=placeForText.getText().toString();
                HelpForwrad helpForwradSecond = new HelpForwrad();
                helpForwradSecond.execute();
                break;
            case R.id.btnEncode:
                String text = placeForText.getText().toString();
                placeForText.setText(CodeN.codedToNumeral(text));
                break;
            case R.id.btnDecode:
                placeForText.setText( CodeN.decodedFromNumeral(placeForText.getText().toString()) );
                break;
            case R.id.btnCln:
                placeForText.setText("");
        }
    }


    class HelpForwrad extends AsyncTask
    {


        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            placeForText.setText(text);

        }

        @Override
        protected Object doInBackground(Object[] params) {
            if(indikator==0)
            {
                text=ClassForIO.readFromFile(path);
            }
            else
            {
                ClassForIO.writeInFile(path,text);
            }

            return null;
        }
    }
}
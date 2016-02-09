package com.example.wadimka.crypto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by WadimKa on 05.02.2016.
 */
public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_lat);
        try
        {
            TimeUnit.SECONDS.sleep(5);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

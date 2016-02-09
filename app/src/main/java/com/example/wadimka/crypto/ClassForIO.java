package com.example.wadimka.crypto;

import android.os.AsyncTask;
import android.util.Log;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by WadimKa on 05.02.2016.
 */
public class ClassForIO
{
    public static String readFromFile(String path)
    {
        String retData="";
        File file = new File(path);
        try
        {
            FileReader fileReader = new FileReader(path);

            int i = 0;
            while ((i = fileReader.read()) != -1) {
                retData += (char) i;
            }
            fileReader.close();
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return retData;

    }



    public static void writeInFile(String pathForWrite, String dataForWrite)
    {
        Log.d("DDD","1");
        File file = new File(pathForWrite);
        try
        {
            Log.d("DDD", "2");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(dataForWrite);
            fileWriter.close();
            Log.d("DDD","writed");
        }
        catch (Exception e)
        {
            Log.d("DDD",e.getMessage());

        }
    }





}

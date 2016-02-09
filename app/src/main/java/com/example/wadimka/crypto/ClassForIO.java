package com.example.wadimka.crypto;

import android.os.AsyncTask;

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
            FileReader fileReader = new FileReader("/storage/extSdCard/dat.txt");

            int i=0;
            while((i=fileReader.read())!=-1)
            {
                retData+=(char) i;
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
        File file = new File(pathForWrite);
        try
        {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(dataForWrite);
            fileWriter.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }





}

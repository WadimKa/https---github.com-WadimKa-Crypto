package com.example.wadimka.crypto;

/**
 * Created by WadimKa on 05.02.2016.
 */
public class Convert
{
    public static String fromArrayNumbersToString(int[] arr)
    {
        String data="";

        for(int ar : arr)
        {
            data+=ar+" ";
        }
        return data;

    }

    public static String fromArrayLiteralToString(char[] arr)
    {
        String data="";

        for(char ar : arr)
        {
            data+=ar;
        }
        return data;

    }
}

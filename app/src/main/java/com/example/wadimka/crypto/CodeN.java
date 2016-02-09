package com.example.wadimka.crypto;

/**
 * Created by WadimKa on 05.02.2016.
 */
public class CodeN
{

    public static String codedToNumeral(String text)
    {
        char[] dat = text.toCharArray();
        int[] numbers = new int[dat.length];
        for(int i = 0; i<dat.length;i++)
        {
            numbers[i]=(int) dat[i];
        }
        String returnData = Convert.fromArrayNumbersToString(numbers);
        return returnData ;

    }

    public static String  decodedFromNumeral(String stringForDecod)
    {
        String data="";

        String[] arrayAsSplit = stringForDecod.split(" ");
        int[] arrayForNumbers = new int[arrayAsSplit.length];
        for(int i = 0; i<arrayAsSplit.length;i++)
        {
            arrayForNumbers[i]= Integer.parseInt(arrayAsSplit[i]);
            data+=(char) arrayForNumbers[i];
        }
        return data;

    }
}

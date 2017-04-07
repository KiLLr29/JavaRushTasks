package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String File1 = reader.readLine();
        String File2 = reader.readLine();
        String File3 = reader.readLine();
        reader.close();
        FileInputStream InputStream = new FileInputStream(File1);
        FileOutputStream OutputStreamFile2 = new FileOutputStream(File2);
        FileOutputStream OutputStreamFile3 = new FileOutputStream(File3);
        int byteCount = InputStream.available();
        for (int i = 0; i < (byteCount/2+byteCount%2); i++){
            OutputStreamFile2.write(InputStream.read());
        }
        while (InputStream.available()>0){
            OutputStreamFile3.write(InputStream.read());
        }
        InputStream.close();
        OutputStreamFile2.close();
        OutputStreamFile3.close();
    }
}

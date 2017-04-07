package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String File1 = reader.readLine();
        String File2 = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(File1);
        FileOutputStream outputStream = new FileOutputStream(File2);
        while (inputStream.available() > 0) {
            byte[] inputStreamMassBytes = new byte[inputStream.available()];
            int count = inputStream.read(inputStreamMassBytes);
            for (int i = 0; i < inputStreamMassBytes.length / 2; i++) {
                byte tmp = inputStreamMassBytes[i];
                inputStreamMassBytes[i] = inputStreamMassBytes[inputStreamMassBytes.length - i - 1];
                inputStreamMassBytes[inputStreamMassBytes.length - i - 1] = tmp;
            }
            outputStream.write(inputStreamMassBytes, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}

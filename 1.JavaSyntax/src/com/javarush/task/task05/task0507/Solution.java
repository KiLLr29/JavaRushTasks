package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int result = 0;
        int count = 0;
        while(num != -1){
            result = result+num;
            num = Integer.parseInt(reader.readLine());
            count++;
        }
        System.out.print((double)result/count);
    }
}


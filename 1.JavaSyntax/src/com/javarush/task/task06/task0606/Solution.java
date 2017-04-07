package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(str);
        for(int i = 0; i < str.length(); i++){
            if ((num%10)%2 == 0) { even++;} else { odd++;}
            num = num/10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
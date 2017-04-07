package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }
        String strMin = list.get(0);
        String strMax = list.get(0);
        int min = 0;
        int max = 0;
        for (int i = 1; i< 10; i++)
        {
            if (list.get(i).length() < strMin.length()) { strMin = list.get(i); min = i; }
            if (list.get(i).length() > strMax.length()) { strMax = list.get(i); max = i; }
        }
        if (max < min) { System.out.println(strMax); }
        else { System.out.println(strMin);}
    }
}

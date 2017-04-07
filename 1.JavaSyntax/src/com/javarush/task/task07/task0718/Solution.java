package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int i = 1;
        while(i < list.size()) {
            if (list.get(i).length() > list.get(i-1).length()) {
                i++;
            } else { System.out.println(i); i = list.size();}
        }
    }
}


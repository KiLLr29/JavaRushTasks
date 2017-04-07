package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int result = 1;
        int result2 = 1;
        for (int i = 1; i < list.size(); i++){
            if (list.get(i-1) == list.get(i)) { result++;}
            else {
                if(result2 < result) result2=result;
                result = 1;
            }
        }
        if(result2 < result) result2=result;
        System.out.println(result2);
    }
}
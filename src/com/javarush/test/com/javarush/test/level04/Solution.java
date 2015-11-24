package com.javarush.test.com.javarush.test.level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by alena on 01.11.15.
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        int age = Integer.parseInt(br.readLine());
        theSame(age);
    }

    public static void theSame(int age){
        if (age > 18){
            System.out.println("И 18-ти достаточно");
        }
    }
}

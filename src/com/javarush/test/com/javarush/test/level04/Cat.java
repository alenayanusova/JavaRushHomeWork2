package com.javarush.test.com.javarush.test.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alena on 01.11.15.
 */
public class Cat
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException
    {
        //Инициализируйте (создайте и заполните) массив тут
        int[] array = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}

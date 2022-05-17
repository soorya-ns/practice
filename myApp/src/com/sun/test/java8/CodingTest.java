package com.sun.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest {

    public static void main(String[] args) {

        Integer[] numbers = {2, 1, 0,3, 2, 1, 5, 2, 0,1};
        Integer [] resultArray = grouping(numbers);

        String arr = Arrays.stream(numbers).collect(Collectors.groupingBy(a -> a)).toString();
        System.out.println(arr);
        for(Integer s : resultArray) {
            System.out.println(s);
        }

    }
    public static Integer[] grouping(Integer[] numbers) {
        List<Integer> list = new ArrayList<>();
        Integer[] resultArray = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(!list.contains(numbers[i])){
                int iVal = numbers[i];
                list.add(iVal);
                resultArray[i] = iVal;
                for (int j = 0; j < numbers.length; j++) {
                    if (i != j && iVal == numbers[j]) {
                        resultArray[++i] = iVal;
                    }
                }
            }
        }
        return resultArray;
    }


    /*
    *   int temp = 0;
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }*/

}

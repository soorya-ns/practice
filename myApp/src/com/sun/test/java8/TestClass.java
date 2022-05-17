package com.sun.test.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {

        test();


    }
    public static void test() {
//Trash - Max Weight per trip - Calculate how many trips required? Condition: Max Weight per trip would be 3
        List<Float> weight = new ArrayList<>();
        weight.add((float) 1.00);
        weight.add((float) 1.00);
        weight.add((float) 0.90);
        weight.add((float) 1.95);
        weight.add((float) 1.10);
        weight.add((float) 2.40);
        weight.add((float) 0.20);

        Collections.sort(weight);
        System.out.println(weight);

        int xV = 3;//Max Weight per trip
        int possible = 0;
        float temp=0;
        for(int i=0; i<weight.size(); i++){
            temp=temp+weight.get(i);
            System.out.println(i+": temp : "+temp);
            if(temp==xV){
                possible = possible+1;
                temp=0;
            }else if(temp>xV){
                temp=temp-weight.get(i);
                possible = possible+1;
                temp=0;
                i=i-1;
            }else if(temp<xV && i==weight.size()-1){
                possible = possible+1;
            }

        }
        System.out.println(": :  "+possible);


    }

    public static void test1() {



        ////////////////////////////
        int x=5; int y =0;

        //int iVal = y!=0 & x/y;:0)
        B b = new B();

        if((b instanceof B))
        System.out.println("Yes");

        ///////////////////////////////
        String[] arrStr = {"ab", "ba", "ab", "ac" };


        List<String> newList = Arrays.stream(arrStr).distinct().collect(Collectors.toList());

        System.out.println(newList);

        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(1000));

        randomNumbers.limit(20).forEach(System.out::println);
    }

}

class A{}

class B {}

class c{}

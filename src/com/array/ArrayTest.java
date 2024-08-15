package com.array;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        int[] age=new int[5];

        for(int i=0;i<age.length;i++){
            System.out.println("Enter age : ");
            Scanner sc=new Scanner(System.in);

            age[i]=sc.nextInt();
        }
        int index=0;
        for(int a:age){
            System.out.println("Age["+index+"] :"+a);
            index++;
        }

    }
}

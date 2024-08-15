package com.array;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {

        //2.WAP to store and  print name of 6 cities.

//        String[] city=new String[6];
//
//        for(int i=0;i<6;i++){
//            System.out.println("Enter City Name ");
//            Scanner sc=new Scanner(System.in);
//            city[i] =sc.nextLine();
//        }
//
//        for(String c:city){
//            System.out.println(c);
//        }


        //3.WAP to store and print odd numbers from 1 to 100.


//        int[] number=new int[100];
//        int n=100;
//        int index=0;
//        while(n>0){
//
//            if(n%2==0){
//
//                        number[index]=n;
//                        index++;
//                }
//            n--;
//            }
//
//        for(int num:number){
//            System.out.println(num);
//        }

        //4.WAP to store and print even numbers from 1 to 100.
//        int[] number=new int[100];
//        int n=100;
//        int index=0;
//        while(n>0){
//
//            if(n%2!=0){
//
//                number[index]=n;
//                index++;
//            }
//            n--;
//        }
//
//        for(int num:number){
//            System.out.println(num);
//        }

        //1.WAP to store and print total,avg price of 10 books.

        int[] price =new int[10];
        int total=0;
        for(int i=0;i<10;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter price of 10 Books");
            price[i] = sc.nextInt();
        }


        for(int p:price){
            total+=p;
        }

        System.out.println("Total price is "+total);
        System.out.println("Average price is "+(total/10));

    }
}

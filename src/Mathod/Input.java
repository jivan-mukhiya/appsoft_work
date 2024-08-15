package Mathod;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public int readPrinciple(){

        System.out.println("Enter principle : ");
        return  sc.nextInt();
    }

    public int readTime(){
        System.out.println("Enter Time : ");
        return  sc.nextInt();
    }

    public float readInterest(){
        System.out.println("Enter Interest : ");
        return  sc.nextFloat();
    }
}

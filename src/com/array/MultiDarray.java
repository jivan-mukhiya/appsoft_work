package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDarray {

    //for calculate total
    static int[] getTotal(int[][] marks){
        int[] total = new int[marks.length];
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<5;j++){

                total[i]+=marks[i][j];
            }
        }


        return total;
    }

    //for remark
    static String[] remark(int[][] marks){

        String[] remark = new String[marks.length];
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<5;j++){
                if(marks[i][j]<35){
                    remark[i]="fall";
                    break;
                }else{
                    remark[i]="pass";
                }
            }
        }
        return remark;
    }

    // for display
    static void display(int[][] marks,String[] students,int[] totalMarks,String[] remark){

        System.out.print("|Student name\t|");
        System.out.println("   "+"\t\t\t\t\t\t\t\tSubject\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t|sub1\t|sub2\t|sub3\t|sub4\t|sub5\t| Total marks |" +
                " Percentage | Remark |");

        for(int i=0;i<students.length;i++){
            System.out.print("|"+students[i]+"\t\t\t|");
            for(int j=0;j<5;j++){
                System.out.print(+marks[i][j]+"\t\t|");

            }
            System.out.print("  "+totalMarks[i]+"\t\t|");
            float percentage =((float) totalMarks[i] /5)*100;
            System.out.print("  "+percentage+"\t|");
            System.out.println("  "+remark[i]+"\t|");
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String[] sName=new String[2];

        int[][] marks=new int[sName.length][5];

        int[] total=new int[2];

        String[] remark=new String[2];

        for (int i=0;i<sName.length;i++){
            System.out.print("Enter student name :");
            sName[i]=scanner.next();
            for(int j=0;j<5;j++){
                System.out.println("Enter student marks :");
                marks[i][j]=scanner.nextInt();

            }
        }

       total=getTotal(marks);
        remark=remark(marks);
        display(marks,sName,total,remark);
    }
}

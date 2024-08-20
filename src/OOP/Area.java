package OOP;

import java.rmi.MarshalException;
import java.util.Scanner;

public class Area {

 int length;
 int breadth;

 public void setDim(int l,int b){
     this.length = l;
     this.breadth=b;
 }

    public int getArea(){

     return length*breadth;
    }

    public static void main(String[] args) {
        Area  area=new Area();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the area: ");
        int l=scanner.nextInt();
        System.out.println("Enter the breadth of the area: ");
        int b=scanner.nextInt();
        area.setDim(l,b);
        System.out.println("Area of rectangle :"+area.getArea());
    }

}

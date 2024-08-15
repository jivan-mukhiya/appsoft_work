package Mathod;

public class CalculateArea {

    static  int getArea(int l,int b){

        return l*b;
    }

    static int getVolume(int h){
        return h*h*h;
    }


    public static void main(String[] args) {
        int l=30;
        int b=20;
        int h=10;

        System.out.println("Area: "+getArea(l,b));
        System.out.println("Volume: "+getVolume(h));
    }
}

package Mathod;

public class CalculateSI {

    static  float input(){
        float p=10000f;
        float t=2f;
        float r=2.5f;
       return processing(p,t,r);
    }

    static float processing(float p,float t,float r){

        return (p*t*r)/100;

    }

    static void output(){

        System.out.println("Simple interest : "+input());
    }


    public static void main(String[] args) {
        output();
    }
}

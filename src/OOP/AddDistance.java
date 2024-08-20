package OOP;

public class AddDistance {

    float distance1;
    float distance2;

    public AddDistance(float distance1, float distance2) {
        this.distance1 = distance1;
        this.distance2 = distance2;
    }

    public void display() {
      float  distance= (distance1*12)+(distance2*12);

        System.out.println("The distance is: "+distance/12+"ft");
    }

    public static void main(String[] args) {
        AddDistance addDistance=new AddDistance(2.4f,3.1f);
        addDistance.display();
    }
}

package OOP;

public class Person {

    String name;
    int roll_no;
    String phone;
    String address;

    public Person(String name, int roll_no, String phone, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone = phone;
        this.address = address;
    }

    public  void  display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Person person=new Person("sam",1,"9875355353","Kathmandu");
        person.display();
        Person person1=new Person("Jhon",2,"98525525","pokhara");
        person1.display();
    }
}

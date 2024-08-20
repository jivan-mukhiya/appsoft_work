package OOP;

public class Employee {


    String name;
    String yearOfJoining;
    double salary;
    String address;

    public Employee(String name, String yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public static void main(String[] args) {

        //Employee 1 Object
        Employee  employee1=new Employee(
                "jiban","2002",60000.00,"kathmandu");

        //Employee 2 Object
        Employee  employee2=new Employee(
                "sabin","2010",43000.00,"kathmandu");

        //Employee 3 Object
        Employee  employee3=new Employee(
                "sagar","2013",30000.00,"Bhaktapur");


        //Header of table
        System.out.println("Name \t Year Of Joining \t Salary \t Address");

        //Employee 1 Display
        System.out.println(employee1.name+"\t\t"+employee1.yearOfJoining+"\t\t\t"
                +employee1.salary+"\t\t"+employee1.address);

        //Employee 2 Display
        System.out.println(employee2.name+"\t\t"+employee2.yearOfJoining+"\t\t\t"
                +employee2.salary+"\t\t"+employee2.address);

        //Employee 3 Display
        System.out.println(employee3.name+"\t\t"+employee3.yearOfJoining+"\t\t\t"
                +employee3.salary+"\t\t"+employee3.address);
    }

}

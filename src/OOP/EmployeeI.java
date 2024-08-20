package OOP;

public class EmployeeI {

    double salary;
    int hours;

    public EmployeeI(double salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

   public void AddSal(){

      if(salary<500){
          salary =salary+10;
      }
   }

   public  void AddWork(){

        if(hours>6)
            salary=salary+5;


   }
   public  void  getInfo(double totalSalary,int hoursPerDay){

       System.out.println("Total Salary: "+totalSalary);
       System.out.println("Hours per day: "+hoursPerDay);
   }

    public static void main(String[] args) {
        EmployeeI  employee1=new EmployeeI(450,8);
        EmployeeI employee2=new EmployeeI(550,5);
        employee1.AddSal();
        employee1.AddWork();
        employee1.getInfo(employee1.salary,employee1.hours);
        employee2.AddSal();
        employee2.AddWork();
        employee2.getInfo(employee2.salary,employee2.hours);
    }
}

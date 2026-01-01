class Employee {
    int id;
    String name;
    double basicSalary;

    void calculateSalary() {
        System.out.println("Salary calculation in Employee class");
    }
}

class FullTimeEmployee extends Employee {
    double allowance;
    double deductions;

    
    void calculateSalary() {
        double salary = basicSalary + allowance - deductions;
        System.out.println("Full Time Employee Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

   
    void calculateSalary() {
        double salary = hours * rate;
        System.out.println("Part Time Employee Salary: " + salary);
    }
}


public class homework1{
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee();
        emp1.id = 1;
        emp1.name = "Rahul";
        emp1.basicSalary = 20000;

        FullTimeEmployee ft = (FullTimeEmployee) emp1;
        ft.allowance = 5000;
        ft.deductions = 2000;


        System.out.println("--------------------------------");

        Employee emp2 = new PartTimeEmployee();
        emp2.id = 2;
        emp2.name = "Anita";

        PartTimeEmployee pt = (PartTimeEmployee) emp2;
        pt.hours = 40;
        pt.rate = 300;

        emp2.calculateSalary(); 
    }
}

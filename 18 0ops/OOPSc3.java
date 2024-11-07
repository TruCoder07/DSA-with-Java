import java.util.*;

public class OOPSc3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 7363;
        e1.name = "Md Tufal";
        e1.salary=150000;
        System.out.println("Information about employee e1:");
        System.out.println("Employee ID = "+e1.id);
        System.out.println("Employee Name = "+e1.name);
        System.out.println("Employee salary = "+e1.salary);
        Employee e2 = new Employee(e1);
        e2.salary=175000;
        System.out.println("Information about employee e2:");
        System.out.println("Employee ID = "+e2.id);
        System.out.println("Employee Name = "+e2.name);
        System.out.println("Employee salary = "+e2.salary);


    }
}

class Employee {
    int id;
    String name;
    int salary;

    Employee(){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    Employee(Employee e1){
        this.id=e1.id;
        this.name=e1.name;
    }

    void setSalary(int newsalary) {
        salary = newsalary;
    }

    void setDesignation(String newName) {
        name = newName;
    }
}
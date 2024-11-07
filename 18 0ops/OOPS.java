import java.util.*;

public class OOPS {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setSalary(150000);
        System.out.println("Employee Increment in this year = " + e1.salary);
        e1.setDesignation("Senior Developer");
        System.out.print("Employee Designation in this year = " + e1.designartion);

    }
}

class Employee {
    int salary;
    String designartion;

    void setSalary(int newsalary) {
        salary = newsalary;
    }

    void setDesignation(String newDesignation) {
        designartion = newDesignation;
    }
}
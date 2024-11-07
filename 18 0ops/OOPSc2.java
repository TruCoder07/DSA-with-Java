import java.util.*;
public class OOPSc2{
    public static void main(String [] args){
        Employee e1 = new Employee();
        e1.setSalary(150000);
        System.out.println("Employee Increment in this year = "+e1.getSalary());
        e1.setDesignation("Senior Developer");
        System.out.print("Employee Designation in this year = "+e1.getDesignation());
        
    }
}
class Employee{
    private int salary;
    private String designation;

    int getSalary(){
        return this.salary;
    }
    String getDesignation(){
        return this.designation;
    }

    void setSalary(int newsalary){
        salary=newsalary;
    }
    void setDesignation(String newDesignation){
        designation=newDesignation;
    }
}
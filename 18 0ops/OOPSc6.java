import java.util.*;
public class OOPSc6{
    public static void main(String[] args) {
      Student Tufail = new  Student();
      Tufail.schoolName = "UMS";

      Student Rahul = new Student();
      System.out.println(Rahul.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String s){
        this.name = s;
    }

    String getName(){
        return this.name;
    }
}
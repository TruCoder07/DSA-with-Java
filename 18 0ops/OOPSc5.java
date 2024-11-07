import java.util.*;
public class OOPSc5{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("Animal Eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }
}

import java.util.*;
public class OOPSc4{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog tiger = new Dog();
        tiger.walk();
        tiger.breed="German Shepherd";
        System.out.println(tiger.breed);
        Peacock p1 = new Peacock();
        Tuna t1 = new Tuna();
        t1.size=5;
        t1.eat();
    }
}

class Animal{
        String skinColour;
        void eat(){
            System.out.println("Eat");
        }
        void breathe(){
            System.out.println("Breathing");
        }
    }

    class Mammal extends Animal {
        int leg;
        void walk(){
            System.out.println("walk");
        }
    }
    class Bird extends Animal{
        int wing; 

    }

     class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("Swim");
        }
    }

    class Dog extends Mammal{
        String breed;

    }
    class Tuna extends Fish{
        int size;
    }
    class Peacock extends Bird{
        String species;
    }

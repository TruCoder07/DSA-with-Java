class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Dog bark");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
    }
}
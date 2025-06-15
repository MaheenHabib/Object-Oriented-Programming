package lab4;

public interface Animal 
{
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

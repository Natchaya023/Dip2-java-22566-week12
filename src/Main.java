class Animal {
    //States
    protected String name;
    //Behavior
    protected void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("My name is " + name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
    public void bark(){
        System.out.println("I can bark");
    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("My name is " + name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat cat food");
    }
    public void meow(){
        System.out.println("I can meow");
    }
}
class Mobile{
    //states
    public String color = "white";
    public int price = 1_000;

    //behavior
    public void  calling(){
        System.out.println("Wait,its connecting");
    }
    public void messaging(){
        System.out.println("You can send messages");
    }
}

public class Main {
    public static void main(String[] args) {
        //instance object
        Mobile obj = new Mobile(); //instance object
        Dog dog = new Dog(); //instance object
        Cat cat = new Cat(); //instance object

        dog.name = "Mike";
        dog.display();
        dog.eat();
        dog.bark();

        cat.name = "Srisawat";
        cat.display();
        cat.eat();
        cat.meow();

        obj.calling();
        obj.messaging();
        System.out.println(obj.color);
        System.out.println(obj.price);
    }
}
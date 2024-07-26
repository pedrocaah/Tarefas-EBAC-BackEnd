public class Animal {
    private String name;

    Animal() {
        this.name = "Animal";
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
public class Dog extends Animal { }
import org.example.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bob");
        System.out.println(dog.getName())
    }
}


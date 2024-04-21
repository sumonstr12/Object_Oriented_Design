package LSP;

// Define the Bird class
class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }

    void eat() {
        System.out.println("Bird is eating");
    }
}

// Define the Duck class that extends Bird
class Duck extends Bird {
    @Override
    void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    void eat() {
        System.out.println("Duck is eating");
    }
}

// Define the Ostrich class that extends Bird
class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }

    @Override
    void eat() {
        System.out.println("Ostrich is eating");
    }
}

public class lsp {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.fly();
        bird1.eat();

        Bird bird2 = new Duck();
        bird2.fly();
        bird2.eat();

        Bird bird3 = new Ostrich();
        try {
            bird3.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        bird3.eat();
    }
}



/*
 * 
 * Liskov Substitution Principle states:
 * Let q(x) be a property provable about objects of x of type T. 
 * Then q(y) should be provable for objects y of type S 
 * where S is a subtype of T.
 * 
 */

 /*

 In this code, Duck and Ostrich are subtypes of Bird. 
 According to LSP, you should be able to use an object 
 of the Duck or Ostrich class wherever you expect 
 an object of the Bird class. 
 However, the Ostrich class violates LSP because ostriches can’t fly, 
 so the fly method throws an UnsupportedOperationException. 
 This means that you can’t use an Ostrich object 
 wherever you expect a Bird object, because calling 
 the fly method on an Ostrich object will result in a runtime error.

 */
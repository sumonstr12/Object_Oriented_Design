/**
 * Liskov's Substituition Principle
 * @author Sumon Chandra Barman
 */

package LSP;

/**
 * Bird class.
 * This class represents a bird with methods to fly and eat.
 */
class Bird {
    /**
     * Method for the bird to fly.
     */
    void fly() {
        System.out.println("Bird is flying");
    }
    /**
     * Method for the bird to eat.
     */
    void eat() {
        System.out.println("Bird is eating");
    }
}

/**
 * Duck class.
 * This class extends Bird and represents a duck.
 */
class Duck extends Bird {
    /**
     * Method for the duck to fly.
     */
    @Override
    void fly() {
        System.out.println("Duck is flying");
    }

    /**
     * Method for the duck to eat.
     */
    @Override
    void eat() {
        System.out.println("Duck is eating");
    }
}

/**
 * Ostrich class.
 * This class extends Bird and represents an ostrich.
 */
class Ostrich extends Bird {
    /**
     * Method for the ostrich to fly.
     * Ostriches can't fly, so this method throws an UnsupportedOperationException.
     */
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }

    /**
     * Method for the ostrich to eat.
     */
    @Override
    void eat() {
        System.out.println("Ostrich is eating");
    }
}

/**
 * Main class.
 */
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

package Abstraction;

public class AbsClass {
    public static void main(String[] args) {

        AbsClass abs = new AbsClass();

        Horse h1 = abs.new Horse();
        h1.canEats();
        h1.canWalk();
        System.out.println(h1.color);

        Chiken ch1 = abs.new Chiken();
        ch1.canEats();
        ch1.canWalk();
        System.out.println(ch1.color);

        Mustang m = abs.new Mustang();
        // heirarchy = animal constructor -> horse-> mustang 
        m.type();
    }

    abstract class Animal {
        String color;

        void canEats() {
            System.out.println("can eat");
        }

        abstract void canWalk();

        // Animal() {
        //     color = "red";
        // }
        Animal(){
            System.out.println("animal construcotr called");
        }
    }

    class Horse extends Animal {
        Horse(){
            System.out.println("horse construcotr called");
        }
        void changeCol() {
            color = "brown";
        }
        void canWalk() {
            System.out.println("walks on 4 legs");
        }
    }
     class Mustang extends Horse {
        Mustang(){
            System.out.println("mustang construcotr called");
        }
        void type(){
            System.out.println("mustang breed");
        }
    }
    class Chiken extends Animal {
        void changeCol() {
            color = "yellow";
        }
        void canWalk() {
            System.out.println("walks on 2 legs");
        }

    }

}

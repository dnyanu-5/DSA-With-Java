package OOPs;

public class Inheritance {
    public static void main(String[] args) {

        Inheritance obj = new Inheritance();  
        Dog d1 = obj.new Dog();
        d1.breed="bullDog";
        System.out.println(d1.breed);
        d1.canBark();
        d1.canHair();
        d1.canEats();
    }

    class Animal{
        String color;
        void canEats(){
            System.out.println("can eats");
        }
        void canSleep(){
            System.out.println("can sleep");
        }
    }

    class Mammales extends Animal{
        int legs;
        void canHair(){
            System.out.println("have hair");
        }
    }
    class Fish extends Animal{
        void canFince(){
            System.out.println("have fince");
        }
    }

    class Dog extends Mammales{
        String breed;
        void canBark(){
            System.out.println("can bark");
        }
    }
    
}

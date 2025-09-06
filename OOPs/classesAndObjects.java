package OOPs;

public class classesAndObjects {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setname("BMW");
        System.out.println(c1.name);
        c1.setPrice(1000);
        System.out.println(c1.price);
        c1.color = "Red";
        System.out.println(c1.color);

        BankAccount b1 = new BankAccount();
        b1.userName = "abc@123";
        System.out.println(b1.userName);
        b1.setPassword("avchdjd");

        Pen p1= new Pen();

        p1.setColor("yellow");
        System.out.println(p1.getcolor());
        p1.setTip(2);
        System.out.println(p1.gettip());

        Students s1= new Students();
        s1.name="sanika";
        System.out.println(s1.name);
        Students s2= new Students("ram");
        System.out.println(s2.name);
        Students s3= new Students(234);
        System.out.println(s3.marks);

    }
}

// classes ad objects
class Car {
    String name;
    String color;
    int price;

    void setname(String Newname) {
        name = Newname;
    }

    void setPrice(int newPrice) {
        price = newPrice;
    }
}

// access specifier
class BankAccount {
    public String userName;
    private String password; // cannot access this in main class as it is private

    void setPassword(String pswd) {
        password = pswd;
    }
}

// getters and setters
class Pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
//constuctors
class Students{
    String name;
    int marks;
    // non parameterized construcor
    Students(){
        System.out.println("construcor is called...");
    }

    // constructor overloading
    // parameterized construcor
    Students(String name){
        this.name=name;
    }
    Students(int marks){
       this.marks=marks;
    }
}
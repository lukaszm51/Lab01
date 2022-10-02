package pl.edu.wszib;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");

        MyClass myClass = new MyClass2();

        myClass.field2 = "Field2";
        myClass.field3 = "Field3";
        myClass.field4 = "Field4";

        myClass.run2();
        myClass.run3();
        myClass.run4();
    }

}


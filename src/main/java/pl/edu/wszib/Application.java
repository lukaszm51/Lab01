package pl.edu.wszib;
import pl.edu.wszib.mypackage.MyClass2;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world");

        String myStaticFiled = MyClass2.MY_STATIC_FILED;
        MyClass2 myClass1 = new MyClass2();
        MyClass2 myClass2 = new MyClass2();
        MyClass2 myClass3 = new MyClass2();

        MyClass2 myClass = new MyClass2();
//        myClass.field2 = "Field2";
        myClass.field3 = "Field3";
        myClass.field4 = "Field4";
//        myClass.run2();
        myClass.run3();
        myClass.run4();

        myClass.run();

        int testVar = 5;
        int newTestVar = testMethod(testVar);
        System.out.println("testVar " + testVar);
    }

    public static int testMethod(int testVar) {
        return testVar * 2;
    }
}


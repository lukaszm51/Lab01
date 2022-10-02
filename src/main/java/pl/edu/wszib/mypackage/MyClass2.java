package pl.edu.wszib.mypackage;

import pl.edu.wszib.MyClass;
import pl.edu.wszib.MyInterface;

public class MyClass2 extends MyClass implements MyInterface {
    //public MyClass myClass;

    @Override
    public void run() {
        field3 = "Field3 from extended";
        run3();
        //myClass.run4();
    }

//    @Override
//    public void run2() {
//
//    }

}

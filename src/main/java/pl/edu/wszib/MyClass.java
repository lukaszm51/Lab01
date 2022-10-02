package pl.edu.wszib;

public abstract class MyClass {

    //modyfikatory dostepu
    // private
    //
    // protected
    // public
    private String field1;

    String field2;

    protected String field3;

    public String field4;


    //metody
    private void run1() {
        System.out.println("field1 = " + field1);
    }

    void run2() {
        System.out.println("field2 = " + field2);
    }

    protected void run3() {
        System.out.println("field3 = " + field3);
    }

    public void run4() {
        System.out.println("field4 = " + field4);
        run1();
    }
}

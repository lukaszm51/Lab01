package zad1;

public class ShakeTruskawkowy extends Shake implements Smak {



    @Override
    public void pij() {
        System.out.println("Pije shake");
    }

    @Override
    public void smak() {
        System.out.print(" o smaku truskawkowym.");
    }
}



package zad1;

public abstract class Koktajl implements Jadalne, Pijalne {

    protected int kcal;

    public Koktajl(final int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }
}
package zad1;

public enum RodzajSmaku {
    TRUSKAWKOWY("Truskawkowy", 3),
    BANANOWY("Bananowy", 2),
    SZPINAKOWY("Szpinakowy", 0),
    CIASTECZKOWY("Ciasteczkowy", 4),
    JABLKOWY("Jablkowy", 1),
    ;
    private final String opis;
    private final int poziomSlodkosci;

    RodzajSmaku(final String opis,
                final int poziomSlodkosci) {
        this.opis = opis;
        this.poziomSlodkosci = poziomSlodkosci;
    }

    public String opis() {
        return opis;
    }

    public int poziomSlodkosci() {
        return poziomSlodkosci;
    }

    @Override
    public String toString() {
        return "RodzajSmaku{" +
                "opis='" + opis + '\'' +
                ", poziomSlodkosci=" + poziomSlodkosci +
                '}';
    }
}
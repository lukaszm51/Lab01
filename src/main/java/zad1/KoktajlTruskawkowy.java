package zad1;

public class KoktajlTruskawkowy extends KoktajlSmakowy {
    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        String message = String.format(
                "Pije koktajl %s, który cechuje się %s, którego źródłem smaku jest: %s",
                smak(),
                rodzajTruskawki,
                zrodloSmaku()
        );
        System.out.println(message);
    }
}
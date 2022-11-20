package zad1;

public class App {
    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA
        );
        koktajlTruskawkowy.pij();
        koktajlTruskawkowy.jedz();
        RodzajTruskawki rodzajTruskawki = RodzajTruskawki.ANANASOWA;
    }

}

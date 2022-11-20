package zad1;

public enum RodzajTruskawki {
    ANANASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie"),
    BRAND_NEW("Jest GMO"),
    SUPER_NEW("Jest jeszcze lepszy i nowszy")
    ;

    private final String cecha;

    RodzajTruskawki(final String cecha) {
        this.cecha = cecha;
    }

    public String cecha() {
        return cecha;
    }

    @Override
    public String toString() {
        return "RodzajTruskawki[" + name() + "]{" +
                "cecha='" + cecha + '\'' +
                '}';
    }
}
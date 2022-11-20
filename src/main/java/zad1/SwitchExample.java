package zad1;

import java.util.Random;

public class SwitchExample {

    public static void main(String[] args) {
        final RodzajTruskawki[] wszystkieRodzajeTruskawek = RodzajTruskawki.values();
        final int index = new Random().nextInt(0, wszystkieRodzajeTruskawek.length);
        final RodzajTruskawki rodzajTruskawki = RodzajTruskawki.SUPER_NEW; //wszystkieRodzajeTruskawek[index];
        System.out.println("Wylosowano " + rodzajTruskawki);
        int sizeFromStatement = switchStatementRozmiarV2(rodzajTruskawki);
        // switch expressions are recommended!!!
        int sizeFromExpression = sizeUsingSwitchExpression(rodzajTruskawki);
    }

    private static int switchStatementRozmiarV1(RodzajTruskawki rodzajTruskawki) {
        final int size;
        switch (rodzajTruskawki) {
            case HONEOYE:
                size = 1;
                System.out.println(rodzajTruskawki);
                break;
            case CHRISTINE:
                size = 2;
                System.out.println(rodzajTruskawki);
                break;
            case ANANASOWA:
                size = 3;
                System.out.println(rodzajTruskawki);
                break;
            case KENT:
                size = 4;
                System.out.println(rodzajTruskawki);
                break;
            case POLKA:
                size = 5;
                System.out.println(rodzajTruskawki);
                break;
            case BRAND_NEW:
                size = 6;
                System.out.println(rodzajTruskawki);
                break;
            case SUPER_NEW:
                size = 7;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rodzajTruskawki);
        }
        return size;
    }

    private static int switchStatementRozmiarV2(RodzajTruskawki rodzajTruskawki) {
        switch (rodzajTruskawki) {
            case HONEOYE:
                return 1;
            case CHRISTINE:
                return 2;
            case ANANASOWA:
                return 3;
            case KENT:
                return 4;
            case POLKA:
            case BRAND_NEW:
                return 6;
            case SUPER_NEW:
                return 7;
            default:
                throw new IllegalStateException("Unexpected value: " + rodzajTruskawki);
        }
    }

    private static int sizeUsingSwitchExpression(RodzajTruskawki rodzajTruskawki) {
        return switch (rodzajTruskawki) {
            case ANANASOWA -> 1;
            case HONEOYE -> {
                System.out.println(rodzajTruskawki);
                yield 2;
            }
            case KENT -> 3;
            case CHRISTINE -> extraMethod(rodzajTruskawki);
            case POLKA, BRAND_NEW -> 6;
            case SUPER_NEW -> 7;
        };
    }

    private static int extraMethod(RodzajTruskawki rodzajTruskawki) {
        return 5;
    }
}
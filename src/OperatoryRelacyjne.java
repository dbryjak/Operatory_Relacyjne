public class OperatoryRelacyjne {
    public static void main(String[] args) {

        boolean wynik;
        wynik = 8 == 8;
        System.out.println("Czy " + "8 = 8: " + wynik);

        wynik = 3 == 8;
        System.out.println("Czy " + "3 = 8: " + wynik);

        wynik = 3 != 8;
        System.out.println("Czy 3 jest różne od 8: " + wynik);

        wynik = 3 < 8;
        System.out.println("Czy 3 jest mniejsze od 8: " + wynik);

        wynik = 3 <= 8;
        System.out.println("Czy 3 <= 8: " + wynik);

        wynik = 3 > 8;
        System.out.println("Czy 3 jest > od 8: " + wynik);

        wynik = 3 >= 8;
        System.out.println("Czy 3 jest >= 8: " + wynik);

    }
}

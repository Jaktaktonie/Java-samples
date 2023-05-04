//Zmiene - liczna w formacie int oraz jej wyświetlenie a także działanie na nie


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int liczba0 = 4;
        System.out.println("Twoja liczba to:\n" + liczba0);

        Liczby liczby = new Liczby();
        liczby.showLiczby();
    }

    static class Liczby {

        Scanner scanner = new Scanner(System.in);
        int liczba1, liczba2;

        public Liczby() {


            System.out.println("Podaj liczbę nr 1 ");
            liczba1 = scanner.nextInt();

            System.out.println("Podaj liczbę nr 2 ");
            liczba2 = scanner.nextInt();
        }

            public void showLiczby() {

                System.out.println("Liczba1 = " + liczba1);
                System.out.println("Liczba2 = " + liczba2);
            }
        }
    }

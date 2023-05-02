import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj wielkosc tablicy: ");
        int size = input.nextInt();
        String[] array = new String[size];
        System.out.println("Wprowadz " + size + " Stringów do tablicy:");
        for(int i = 0; i < size; i++) {
            array[i] = input.next();
        }
        System.out.println("Wartości w tablicy:");
        for(int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}

//bardziej zaawansowany

/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        String[] tablica = new String[n];
        System.out.println("Podaj " + n + " wartości do tablicy:");
        for (int i = 0; i < n; i++) {
            tablica[i] = scanner.next();
        }
        System.out.println("Tablica zawiera wartości:");
        for (int i = 0; i < n; i++) {
            System.out.println(tablica[i]);
        }
    }
}

*/

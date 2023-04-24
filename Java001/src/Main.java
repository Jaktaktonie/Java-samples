import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą:");
        int liczba = scanner.nextInt();


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("liczba.txt"));
            writer.write(String.valueOf(liczba));
            writer.close();
            System.out.println("Liczba zapisana do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

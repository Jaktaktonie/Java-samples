import java.util.Arrays; // let mport class Arrays
import java.util.Comparator; //wykład z 26.04.2023


public class Main {
    public static void main(String[] args) {
        String[] words = {"jabłko", "gruszka", "banan", "pomarańcza", "mandarynka"};


        // nadanie wartości numerycznych do elementów tablicy
        for (int i = 0; i < words.length; i++) {
            words[i] += " = " + String.valueOf(i);
        }

        Arrays.sort(words);  //matrix sort
        // wyświetlenie zawartości tablicy
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("\n");

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int n1 = Integer.parseInt(s1.split("=")[1].trim());
                int n2 = Integer.parseInt(s2.split("=")[1].trim());
                return Integer.compare(n1, n2);
            }
        });

// wyświetlenie zawartości posortowanej tablicy
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);


        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Legnica", "Sejmowa");

        Male male1 = new Male("A", "Aa", 1, address);
        Male male2 = new Male("Bb", "Bbb", 2, address);
        Female female = new Female("Cc", "Ccc", 3, address);

        Person[] persons = {male1, male2, female};

        System.out.println("Dane wszystkich osób:");
        for (Person person : persons) {
            person.printDetails();
            System.out.println();
        }

        System.out.println("Wiek przechodzenia na emeryturę:");
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getSurname() + ": " + person.getRetirementAge());
        }

        System.out.println("Rok urodzenia:");
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getSurname() + ": " + person.getBirthYear());
        }

        // Tworzenie listy females z obiektami klasy Female
        ArrayList<Female> females = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Female) {
                females.add((Female) person);
            }
        }

        // Sortowanie females po długości imienia w porządku rosnącym
        Collections.sort(females, new Comparator<Female>() {
            @Override
            public int compare(Female f1, Female f2) {
                return Integer.compare(f1.getName().length(), f2.getName().length());
            }
        });

        System.out.println("Posortowane females według długości imienia (rosnąco):");
        for (Female femalePerson : females) {
            femalePerson.printDetails();
            System.out.println();
        }

        // Liczenie liczby mężczyzn i kobiet w persons
        int maleCount = 0;
        int femaleCount = 0;
        for (Person person : persons) {
            if (person instanceof Male) {
                maleCount++;
            } else if (person instanceof Female) {
                femaleCount++;
            }
        }

        System.out.println("Liczba mężczyzn: " + maleCount);
        System.out.println("Liczba kobiet: " + femaleCount);

        // Tworzenie kopii obiektu male
        Male male = new Male("D", "Dd", 4, address);
        Male clonedMale = (Male) male.clone();

        male.getAddress().setCity("TEST");

        System.out.println("Dane obiektu male:");
        male.printDetails();

        System.out.println("Dane obiektu clonedMale:");
        clonedMale.printDetails();
    }
}

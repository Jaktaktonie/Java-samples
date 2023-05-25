public abstract class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public abstract int getRetirementAge();

    public int getBirthYear() {
        return 2023 - age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        address.printAddress();
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Błąd podczas klonowania obiektu Person.", e);
        }
    }
}

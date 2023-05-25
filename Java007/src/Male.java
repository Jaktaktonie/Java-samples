public class Male extends Person {
    public Male(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    public int getRetirementAge() {
        return 65;
    }


    @Override
    public int compareTo(Person other) {
        if (other instanceof Male) {
            Male otherMale = (Male) other;
            return Integer.compare(otherMale.getAge(), this.getAge());
        }
        return -1;
    }
}
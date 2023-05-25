public class Female extends Person {
    public Female(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    public int getRetirementAge() {
        return 60;
    }

    @Override
    public int compareTo(Person other) {
        if (other instanceof Female) {
            Female otherFemale = (Female) other;
            return Integer.compare(otherFemale.getAge(), this.getAge());
        }
        return 1;
    }
}
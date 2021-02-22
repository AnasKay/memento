
public class Memento {
    private Person person;

    public Memento(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}

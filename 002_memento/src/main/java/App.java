public class App {
    public static void main(String[] args) {

        Person originator = Person.builder().weight(89.4)
                                            .foreName("Test")
                                            .name("Person").build();


        Caretaker careTaker = new Caretaker();

        //save memento Obj in Caretaker array
        Memento state1 = originator.getState();
        careTaker.add(state1);
        //change Obj
        originator.setWeight(81.9);
        Memento state2 = originator.getState();
        careTaker.add(state2);

        originator.setName("MarriedPerson");
        Memento state3 = originator.getState();
        careTaker.add(state3);

        originator.setWeight(105.9);
        Memento state4 = originator.getState();
        careTaker.add(state4);

        System.out.println(originator.toString());
        System.out.println(state1.getPerson().equals(careTaker.get(0).getPerson()));
        System.out.println(state2.getPerson().equals(careTaker.get(1).getPerson()));
        System.out.println(state3.getPerson().equals(careTaker.get(2).getPerson()));
        System.out.println(state4.getPerson().equals(careTaker.get(3).getPerson()));

        System.out.println(careTaker.get(0).getPerson());
        System.out.println(state1.getPerson());

    }
}

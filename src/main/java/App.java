public class App {
    public static void main(String[] args) {

        Person originator = Person
                .builder()
                .weight(89.4)
                .foreName("Test")
                .name("Person")
                .build();

        Caretaker careTaker = new Caretaker();

        // state 1 - orginal state
        careTaker.add(originator.saveState());

        // state 2 - weight changed to 50.0
        originator.setWeight(50.0);
        careTaker.add(originator.saveState());

        // state 3 - weight changed to 50.0 and forename changed to "Max"
        originator.setForeName("Max");
        careTaker.add(originator.saveState());
        System.out.println("Current State: " + originator);

        originator.restoreState(careTaker.get(0));
        System.out.println("First saved State: " + originator);
        originator.restoreState(careTaker.get(1));
        System.out.println("Second saved State: " + originator);
        originator.restoreState(careTaker.get(2));
        System.out.println("third saved State: " + originator);
        System.out.println("Is last state same as current state: " + originator.equals(careTaker.get(2).getState()));
    }
}

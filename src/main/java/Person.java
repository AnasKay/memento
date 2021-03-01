import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private double weight;
    private String name;
    private String foreName;

    public Memento saveState(){

        return new Memento(
                Person
                    .builder()
                    .name(getName())
                    .foreName(getForeName())
                    .weight(getWeight())
                    .build()
        );
    }
    public void restoreState(Memento stateToRestore){
        Person previousState = stateToRestore.getState();
        setForeName(previousState.getForeName());
        setName(previousState.getName());
        setWeight(previousState.getWeight());
    }
}

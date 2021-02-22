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


    public Memento getState(){
        return new Memento(this);
    }
}

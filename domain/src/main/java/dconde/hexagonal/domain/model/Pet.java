package dconde.hexagonal.domain.model;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Pet {
    Long id;

    String name;
}

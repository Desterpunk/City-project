package co.com.bancolombia.model.typeconstruction;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class TypeConstruction {

    private String name;
    private String materials;
    private Integer days;

}

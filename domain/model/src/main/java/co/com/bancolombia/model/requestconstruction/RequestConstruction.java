package co.com.bancolombia.model.requestconstruction;
import co.com.bancolombia.model.typeconstruction.TypeConstruction;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(toBuilder = true)
public class RequestConstruction {

    private TypeConstruction typeConstruction;
    private Integer coordinatesX;
    private Integer coordinatesY;
    private String  state;
    private LocalDate applicationdate;
    private LocalDate deliverDate;

}

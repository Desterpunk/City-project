package co.com.bancolombia.mongo.document;

import co.com.bancolombia.model.typeconstruction.TypeConstruction;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("request")
@Data
@Builder(toBuilder = true)
public class RequestConstructionDocument {
//    private TypeConstruction typeConstruction;
    private Integer coordinatesX;
    private Integer coordinatesY;
    private String  state;
    private LocalDate applicationdate;
    private LocalDate deliverDate;

}

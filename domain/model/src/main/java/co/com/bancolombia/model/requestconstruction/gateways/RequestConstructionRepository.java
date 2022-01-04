package co.com.bancolombia.model.requestconstruction.gateways;

import co.com.bancolombia.model.requestconstruction.RequestConstruction;
import reactor.core.publisher.Mono;

public interface RequestConstructionRepository {

    Mono<RequestConstruction> createRequest(RequestConstruction requestConstruction);

}

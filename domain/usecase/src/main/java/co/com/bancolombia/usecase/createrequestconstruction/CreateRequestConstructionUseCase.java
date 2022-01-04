package co.com.bancolombia.usecase.createrequestconstruction;

import co.com.bancolombia.model.requestconstruction.RequestConstruction;
import co.com.bancolombia.model.requestconstruction.gateways.RequestConstructionRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateRequestConstructionUseCase {

    private final RequestConstructionRepository requestConstructionRepository;

    public Mono<RequestConstruction> createRequest (RequestConstruction requestConstruction) {

        System.out.println(requestConstruction);
        return requestConstructionRepository.createRequest(requestConstruction);

    }
}

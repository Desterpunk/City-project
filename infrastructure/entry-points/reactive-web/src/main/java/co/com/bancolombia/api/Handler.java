package co.com.bancolombia.api;

import co.com.bancolombia.model.requestconstruction.RequestConstruction;
import co.com.bancolombia.usecase.createrequestconstruction.CreateRequestConstructionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
private  final CreateRequestConstructionUseCase useCase;
//private  final UseCase2 useCase2;
    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase2.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenPOSTCreateRequest(ServerRequest serverRequest) {
//        useCase.createRequest(serverRequest);

        return ServerResponse.ok().bodyValue("Prueba");
    }
}

package co.com.bancolombia.api;

import co.com.bancolombia.model.requestconstruction.RequestConstruction;
import co.com.bancolombia.usecase.createrequestconstruction.CreateRequestConstructionUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;


@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(CreateRequestConstructionUseCase createRequestConstructionUseCase) {
        return route(POST("/crateRequest").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(RequestConstruction.class)
                        .flatMap(resource -> createRequestConstructionUseCase.createRequest(resource)
                                .flatMap(requestConstruction -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(requestConstruction))
                        )
        );

    }
}

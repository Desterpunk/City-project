package co.com.bancolombia.mongo;

import co.com.bancolombia.model.requestconstruction.RequestConstruction;
import co.com.bancolombia.model.requestconstruction.gateways.RequestConstructionRepository;
import co.com.bancolombia.mongo.document.RequestConstructionDocument;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<RequestConstruction, RequestConstructionDocument, String, MongoDBRepository> implements RequestConstructionRepository
// implements ModelRepository from domain
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, RequestConstruction.class));
    }

    @Override
    public Mono<RequestConstruction> createRequest(Mono<RequestConstruction>requestConstruction) {
        System.out.println("Mongo repository");
        RequestConstructionDocument request = RequestConstructionDocument.builder().coordinatesX(7).coordinatesY(8).state("Process").build();
        return repository.save(request).map(this::toEntity);
    }
}

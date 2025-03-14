package com.bootcamp.ms.microservicerequestqueue.producer.repository;

import com.bootcamp.ms.microservicerequestqueue.entity.RequestQueueBc;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RequestQueueBcRepository extends ReactiveMongoRepository<RequestQueueBc, String> {

}

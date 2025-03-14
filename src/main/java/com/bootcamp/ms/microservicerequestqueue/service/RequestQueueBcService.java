package com.bootcamp.ms.microservicerequestqueue.service;

import com.bootcamp.ms.microservicerequestqueue.entity.RequestQueueBc;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RequestQueueBcService {

    Flux<RequestQueueBc> findAll();
    Mono<RequestQueueBc> findById(String id);
    Mono<RequestQueueBc> save(RequestQueueBc wallet);
    Mono<Void> delete(RequestQueueBc wallet);
}

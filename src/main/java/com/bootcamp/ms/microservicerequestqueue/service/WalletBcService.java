package com.bootcamp.ms.microservicerequestqueue.service;

import com.bootcamp.ms.microservicerequestqueue.entity.BootCoin;
import reactor.core.publisher.Mono;

public interface WalletBcService {

    Mono<BootCoin> find(String id);
}

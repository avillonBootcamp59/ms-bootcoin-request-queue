package com.bootcamp.ms.microservicerequestqueue.entity;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "bootCoin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BootCoin {

    @BsonId
    private String id;
    private String type;
    private LocalDate date;
    private Double amount;
    private String idCustomer;
    private String numberDocument;
    private String numberPhone;
    private String idCardDebit;
}

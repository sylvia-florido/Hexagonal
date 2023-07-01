package com.example.hexagonal.adapters.in.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Retorno do Kafka

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean isValidCpf;
}

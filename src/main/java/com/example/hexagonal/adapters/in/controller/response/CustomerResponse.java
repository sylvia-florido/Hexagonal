package com.example.hexagonal.adapters.in.controller.response;

import com.example.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}

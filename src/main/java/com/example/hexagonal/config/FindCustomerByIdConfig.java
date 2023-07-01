package com.example.hexagonal.config;

import com.example.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.example.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.example.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}

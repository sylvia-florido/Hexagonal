package com.example.hexagonal.application.core.usecase;

import com.example.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import com.example.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdOutputPort findCustomerByIdOutputPort,
            DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    public void delete(String id) {
        // Aqui a mesma situação do update, se não existir, dá uma exceção
        findCustomerByIdOutputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}

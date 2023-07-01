package com.example.hexagonal.adapters.out;

import com.example.hexagonal.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemlate;

    @Override
    public void send(String cpf) {
        kafkaTemlate.send("tp-cpf-validation", cpf);
    }
}

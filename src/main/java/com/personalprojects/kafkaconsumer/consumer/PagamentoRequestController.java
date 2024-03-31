package com.personalprojects.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PagamentoRequestController {


    @KafkaListener(
            topics = "${topicos.pagamento.request.topic}",
            groupId = "pagamento.request-consumer-1"
    )
    public void consumer(String message){
        System.out.println("Mensagem recebida: " + message);
    }
}

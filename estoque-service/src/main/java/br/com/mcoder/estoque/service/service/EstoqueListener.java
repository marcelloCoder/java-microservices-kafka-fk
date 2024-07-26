package br.com.mcoder.estoque.service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EstoqueListener {

    @KafkaListener(topics = "product-update-topic", groupId = "estoque-group")
    public void processarVenda(String mensagem){
        System.out.println("Venda recebida : " + mensagem);
    }

}

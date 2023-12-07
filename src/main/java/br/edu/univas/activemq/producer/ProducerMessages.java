package br.edu.univas.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.univas.activemq.model.MessageDTO;

import javax.jms.JMSException;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/producer")
public class ProducerMessages {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/send")
    public ResponseEntity<String> producer(@RequestBody MessageDTO request){
        try {
            jmsTemplate.convertAndSend("message-queue", request);
            return new ResponseEntity("send message", HttpStatus.CREATED);

        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

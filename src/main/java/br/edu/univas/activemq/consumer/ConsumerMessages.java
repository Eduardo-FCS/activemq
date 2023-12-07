package br.edu.univas.activemq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import br.edu.univas.activemq.model.MessageDTO;

@Component
public class ConsumerMessages {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerMessages.class);

	@JmsListener(destination = "message-queue")
	public void onMessage(MessageDTO messageContent) {
		LOGGER.info("received messages {}", messageContent);

	}
}

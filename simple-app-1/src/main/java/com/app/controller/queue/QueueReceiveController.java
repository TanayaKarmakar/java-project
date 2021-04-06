package com.app.controller.queue;

import com.app.domain.Todo;
import com.app.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todoreceive")
public class QueueReceiveController {
    private Logger logger = LoggerFactory.getLogger(QueueSendController.class);
    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping
    //@JmsListener(destination = AppConstants.TODO_QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    public Todo receiveMessage() {
        logger.info("Receiving message");
        Todo todo = (Todo)jmsTemplate.receiveAndConvert(AppConstants.TODO_QUEUE_NAME);
        return todo;
    }
}

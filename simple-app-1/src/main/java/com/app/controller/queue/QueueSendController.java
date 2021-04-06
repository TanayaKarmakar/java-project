package com.app.controller.queue;

import com.app.domain.Todo;
import com.app.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/todosend")
public class QueueSendController {
    private Logger logger = LoggerFactory.getLogger(QueueSendController.class);
    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping
    public Todo sendTodo(@RequestBody Todo todo) {
        logger.info("Sending messages");
        todo.setId(UUID.randomUUID().toString());
        jmsTemplate.convertAndSend(AppConstants.TODO_QUEUE_NAME, todo);
        return todo;
    }
}

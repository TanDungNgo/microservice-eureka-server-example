package com.example.eureka.message.controller;


import com.example.eureka.message.entity.Message;
import com.example.eureka.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> findAllMessages() {
        return messageService.findAllMessages();
    }

    @PostMapping
    public Message save(@RequestBody Message message) {
        return messageService.save(message);
    }
}

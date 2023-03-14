package com.example.eureka.message.service;


import com.example.eureka.message.entity.Message;
import com.example.eureka.message.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> findAllMessages(){
        return messageRepository.findAll();
    }
    public Message save(Message message) {
        return messageRepository.save(message);
    }
}

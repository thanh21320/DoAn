/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Service.ChatService;
import java.util.List;
import models.ChatMsg;
import models.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

/**
 *
 * @author longh
 */
public class ChatController {
    @Autowired
    private ChatService chatService;
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMsg sendMessage(@Payload ChatMsg chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMsg addUser(@Payload ChatMsg chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getNguoiGui());
        return chatMessage;
    }
    
    
    
    @GetMapping("/Chat/all")
    public ResponseEntity<List<ChatMsg>> findAll(){
         List<ChatMsg> msg = chatService.findAll();
         if (msg.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
         return new ResponseEntity<>(msg, HttpStatus.OK);
        
    }
    @GetMapping("/messages/{username}")
    public ResponseEntity<List<Users>> getMessageByUsername(@RequestParam(value="Username") String Username){
         List<Users> users = chatService.findByUsername(Username);
         return new ResponseEntity<>(users, HttpStatus.OK);
    }
    
}

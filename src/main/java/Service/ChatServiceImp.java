/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Repository.ChatRepository;
import Repository.UserRepository;
import java.util.List;
import java.util.Optional;
import models.ChatMsg;
import models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author longh
 */
public abstract class ChatServiceImp implements ChatService{
    @Autowired 
    private ChatRepository chatRepository;
    private UserRepository user;
   
    @Override
    public List<ChatMsg> findAll() {
        return (List<ChatMsg>) chatRepository.findAll();
    }
    @Override
    public void save(ChatMsg msg) {
        chatRepository.save(msg);
    }
    @Override
    public void delete(ChatMsg msg) {
        chatRepository.delete(msg);
    }
    @Override
    public Optional<ChatMsg> findById(Long id) {
        return (Optional<ChatMsg>) chatRepository.findById(id);
    }
    @Override
    public List<Users> findByUsername(String username) {
        return user.find(username);
    }   
}

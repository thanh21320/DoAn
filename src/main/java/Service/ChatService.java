/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import java.util.List;
import java.util.Optional;
import models.ChatMsg;
import models.Users;
/**
 *
 * @author longh
 */
public interface ChatService {
   
   public abstract List<ChatMsg> findAll();
   public abstract Optional<ChatMsg> findById(Long id);
   public abstract void save(ChatMsg msg);
   public abstract void delete(ChatMsg msg);
   public abstract List<Users> findByUsername(String Username); 
}

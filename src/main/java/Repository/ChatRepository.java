/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import models.ChatMsg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 *
 * @author longh
 */
public interface ChatRepository extends CrudRepository<ChatMsg, String> {

    public Object findById(Long id);
    
}

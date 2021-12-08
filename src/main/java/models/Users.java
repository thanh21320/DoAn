/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taikhoan")
/**
 *
 * @author longh
 */
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String HoTen;
    private String Email;
    private String Username;
    private String Password;
    public Users(){
    }
    public Users(long id) {
        this.ID=id;
    }

    public Users( String HoTen, String Email, String Username, String Password) {
        this.HoTen = HoTen;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
    }
    public long getID() {
        return ID;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}

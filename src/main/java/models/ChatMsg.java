/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.sun.istack.NotNull;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
@Table(name="chatMessage")
/**
 *
 * @author longh
 */
public class ChatMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @OneToOne
    @JoinColumn(name = "NguoiGuiId")
    private String NguoiGui;
    
    @OneToOne
    @JoinColumn(name = "NguoiNhanId")
    private String NguoiNhan;
    
    @NotNull
    private Date ThoiGian;
    @NotNull
    private String NoiDung;
    
    public ChatMsg(){
    }

    public ChatMsg(String NguoiGui, String NguoiNhan, Date ThoiGian, String NoiDung) {
        this.NguoiGui = NguoiGui;
        this.NguoiNhan = NguoiNhan;
        this.ThoiGian = ThoiGian;
        this.NoiDung = NoiDung;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNguoiGui() {
        return NguoiGui;
    }

    public void setNguoiGui(String NguoiGui) {
        this.NguoiGui = NguoiGui;
    }

    public String getNguoiNhan() {
        return NguoiNhan;
    }

    public void setNguoiNhan(String NguoiNhan) {
        this.NguoiNhan = NguoiNhan;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }
    
}

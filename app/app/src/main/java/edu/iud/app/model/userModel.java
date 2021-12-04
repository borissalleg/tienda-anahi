package edu.iud.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuario")
public class userModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    int id;

    @Column(name="email", nullable = false, length = 50)
    String mail;
    
    @Column( nullable = false, length = 50)
    String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_UserType", referencedColumnName = "id")
    private userTypeModel idUsertype;


   

    public userModel() {
    }

 
    
   
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

   

    
}

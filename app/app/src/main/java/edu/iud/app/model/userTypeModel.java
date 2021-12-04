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
@Table(name = "tbl_user_type")
public class userTypeModel {
    
    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    // @Column(name="id_user_type")
    private int id;

    @Column(name="tipo_usuario", nullable = false, length = 50 )
    private String tipoUsuario;

   

    
    @OneToOne(mappedBy = "idUsertype")
    private userModel userid;
    
  
    public userTypeModel() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
     
}

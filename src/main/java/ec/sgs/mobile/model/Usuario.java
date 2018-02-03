package ec.sgs.mobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
/**
 * Usuario Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-feb-03
 */
public class Usuario{

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    @Column(length=100)
    private String nombre;
    
    @Column(length=30)
    private String login;

    @Column(length=30)
    private String password;

}


package ec.sgs.mobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

import lombok.Data;

import ec.sgs.mobile.model.AgenciaNaviera;
import ec.sgs.mobile.model.Cliente;
import ec.sgs.mobile.model.Destino;
import ec.sgs.mobile.model.Usuario;

@Data
@Entity
/**
 * Inspeccion Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-feb-03
 */
public class Inspeccion{

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    @Column(length=100)
    private String nombre;

	@Column(length=11)
    private String contenedor;

	@Column(length=2)
    private String tamano;

	@Column(length=8)
    private String chasis;

	@Column(length=8)
    private String placa;

    @ManyToOne @JoinColumn(name="cliente_id")
    private Cliente cliente;

	private Date fecha;
    
    @ManyToOne @JoinColumn(name="agencia_naviera_id")
    private AgenciaNaviera agenciaNaviera;

	@Column(length=50)
    private String vapor;
    
    @ManyToOne @JoinColumn(name="destino_id")
    private Destino destino;

	@Column(length=20)
    private String factura;
    
    private boolean puertaIzquierda;

    private boolean puertaDerecha;
    
    private boolean paredFrontalInternaIzquierda;
    
    private boolean paredFrontalInternaDerecha;
    
    private boolean unidadRefrigeracionIzquierda;

    private boolean unidadRefrigeracionDerecha;
    
    private boolean ladosExternosIzquierda;

    private boolean ladosExternosDerecha;
    
    private boolean ladosInternosIzquierda;

    private boolean ladosInternosDerecha;
    
    private boolean techo;
    
    private boolean piso;

    private boolean estructuraInferior;

    private boolean estructuraInterna;

    private boolean chasisEstado;

	@Column(length=100)
    private String observaciones;

    @ManyToOne @JoinColumn(name="usuario_id")
    private Usuario usuario;

    private boolean cerrado;

}


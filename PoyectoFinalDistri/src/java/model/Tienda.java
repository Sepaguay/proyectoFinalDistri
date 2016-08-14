package model;
// Generated 11-ago-2016 12:41:23 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tienda generated by hbm2java
 */
@Entity
@Table(name="tienda"
    ,catalog="camiones"
)
public class Tienda  implements java.io.Serializable {


     private int codigoTienda;
     private Almacen almacen;
     private String nombreTienda;
     private String direccionTienda;
     private Long telefonoTienda;

    public Tienda() {
    }

	
    public Tienda(int codigoTienda, Almacen almacen) {
        this.codigoTienda = codigoTienda;
        this.almacen = almacen;
    }
    public Tienda(int codigoTienda, Almacen almacen, String nombreTienda, String direccionTienda, Long telefonoTienda) {
       this.codigoTienda = codigoTienda;
       this.almacen = almacen;
       this.nombreTienda = nombreTienda;
       this.direccionTienda = direccionTienda;
       this.telefonoTienda = telefonoTienda;
    }
   
     @Id 

    
    @Column(name="CODIGO_TIENDA", unique=true, nullable=false)
    public int getCodigoTienda() {
        return this.codigoTienda;
    }
    
    public void setCodigoTienda(int codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NUMERO_ALMACEN", nullable=false)
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    
    @Column(name="NOMBRE_TIENDA", length=100)
    public String getNombreTienda() {
        return this.nombreTienda;
    }
    
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    
    @Column(name="DIRECCION_TIENDA", length=200)
    public String getDireccionTienda() {
        return this.direccionTienda;
    }
    
    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    
    @Column(name="TELEFONO_TIENDA", precision=15, scale=0)
    public Long getTelefonoTienda() {
        return this.telefonoTienda;
    }
    
    public void setTelefonoTienda(Long telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }




}



package model;
// Generated 11-ago-2016 12:41:23 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name="rol"
    ,catalog="camiones"
)
public class Rol  implements java.io.Serializable {


     private Integer idRol;
     private String nombreRol;
     private String descripcionRol;
     private boolean estadoRol;

    public Rol() {
    }

    public Rol(String nombreRol, String descripcionRol, boolean estadoRol) {
       this.nombreRol = nombreRol;
       this.descripcionRol = descripcionRol;
       this.estadoRol = estadoRol;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_rol", unique=true, nullable=false)
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    
    @Column(name="nombre_rol", nullable=false, length=30)
    public String getNombreRol() {
        return this.nombreRol;
    }
    
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    
    @Column(name="descripcion_rol", nullable=false, length=100)
    public String getDescripcionRol() {
        return this.descripcionRol;
    }
    
    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    
    @Column(name="estado_rol", nullable=false)
    public boolean isEstadoRol() {
        return this.estadoRol;
    }
    
    public void setEstadoRol(boolean estadoRol) {
        this.estadoRol = estadoRol;
    }




}



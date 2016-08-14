package model;
// Generated 11-ago-2016 12:41:23 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompaniaCamion generated by hbm2java
 */
@Entity
@Table(name="compania_camion"
    ,catalog="camiones"
)
public class CompaniaCamion  implements java.io.Serializable {


     private String idCompania;
     private Integer rucCompania;
     private String direccionCompania;
     private Set camions = new HashSet(0);

    public CompaniaCamion() {
    }

	
    public CompaniaCamion(String idCompania) {
        this.idCompania = idCompania;
    }
    public CompaniaCamion(String idCompania, Integer rucCompania, String direccionCompania, Set camions) {
       this.idCompania = idCompania;
       this.rucCompania = rucCompania;
       this.direccionCompania = direccionCompania;
       this.camions = camions;
    }
   
     @Id 

    
    @Column(name="ID_COMPANIA", unique=true, nullable=false, length=10)
    public String getIdCompania() {
        return this.idCompania;
    }
    
    public void setIdCompania(String idCompania) {
        this.idCompania = idCompania;
    }

    
    @Column(name="RUC_COMPANIA")
    public Integer getRucCompania() {
        return this.rucCompania;
    }
    
    public void setRucCompania(Integer rucCompania) {
        this.rucCompania = rucCompania;
    }

    
    @Column(name="DIRECCION_COMPANIA", length=200)
    public String getDireccionCompania() {
        return this.direccionCompania;
    }
    
    public void setDireccionCompania(String direccionCompania) {
        this.direccionCompania = direccionCompania;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="companiaCamion")
    public Set getCamions() {
        return this.camions;
    }
    
    public void setCamions(Set camions) {
        this.camions = camions;
    }




}



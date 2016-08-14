package model;
// Generated 11-ago-2016 12:41:23 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedido generated by hbm2java
 */
@Entity
@Table(name="pedido"
    ,catalog="camiones"
)
public class Pedido  implements java.io.Serializable {


     private int numeroPedido;
     private Viaje viaje;
     private Almacen almacen;
     private Producto producto;
     private BigDecimal pesoPedido;
     private BigDecimal volumenPedido;
     private Integer tiendadestinoPedido;
     private String estadoPedido;
     private Date fechaProPe;
     private Integer cantidadProPe;

    public Pedido() {
    }

	
    public Pedido(int numeroPedido, Viaje viaje, Almacen almacen, Producto producto) {
        this.numeroPedido = numeroPedido;
        this.viaje = viaje;
        this.almacen = almacen;
        this.producto = producto;
    }
    public Pedido(int numeroPedido, Viaje viaje, Almacen almacen, Producto producto, BigDecimal pesoPedido, BigDecimal volumenPedido, Integer tiendadestinoPedido, String estadoPedido, Date fechaProPe, Integer cantidadProPe) {
       this.numeroPedido = numeroPedido;
       this.viaje = viaje;
       this.almacen = almacen;
       this.producto = producto;
       this.pesoPedido = pesoPedido;
       this.volumenPedido = volumenPedido;
       this.tiendadestinoPedido = tiendadestinoPedido;
       this.estadoPedido = estadoPedido;
       this.fechaProPe = fechaProPe;
       this.cantidadProPe = cantidadProPe;
    }
   
     @Id 

    
    @Column(name="NUMERO_PEDIDO", unique=true, nullable=false)
    public int getNumeroPedido() {
        return this.numeroPedido;
    }
    
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NUMERO_VIAJE", nullable=false)
    public Viaje getViaje() {
        return this.viaje;
    }
    
    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NUMERO_ALMACEN", nullable=false)
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PRODUCTO", nullable=false)
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    @Column(name="PESO_PEDIDO", precision=5)
    public BigDecimal getPesoPedido() {
        return this.pesoPedido;
    }
    
    public void setPesoPedido(BigDecimal pesoPedido) {
        this.pesoPedido = pesoPedido;
    }

    
    @Column(name="VOLUMEN_PEDIDO", precision=5)
    public BigDecimal getVolumenPedido() {
        return this.volumenPedido;
    }
    
    public void setVolumenPedido(BigDecimal volumenPedido) {
        this.volumenPedido = volumenPedido;
    }

    
    @Column(name="TIENDADESTINO_PEDIDO")
    public Integer getTiendadestinoPedido() {
        return this.tiendadestinoPedido;
    }
    
    public void setTiendadestinoPedido(Integer tiendadestinoPedido) {
        this.tiendadestinoPedido = tiendadestinoPedido;
    }

    
    @Column(name="ESTADO_PEDIDO", length=50)
    public String getEstadoPedido() {
        return this.estadoPedido;
    }
    
    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_PRO_PE", length=10)
    public Date getFechaProPe() {
        return this.fechaProPe;
    }
    
    public void setFechaProPe(Date fechaProPe) {
        this.fechaProPe = fechaProPe;
    }

    
    @Column(name="CANTIDAD_PRO_PE")
    public Integer getCantidadProPe() {
        return this.cantidadProPe;
    }
    
    public void setCantidadProPe(Integer cantidadProPe) {
        this.cantidadProPe = cantidadProPe;
    }




}


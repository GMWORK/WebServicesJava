/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmwork.webgmwork;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mateo
 */
@Entity
@Table(name = "producto_has_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductoHasPedido.findAll", query = "SELECT p FROM ProductoHasPedido p"),
    @NamedQuery(name = "ProductoHasPedido.findByProductoid", query = "SELECT p FROM ProductoHasPedido p WHERE p.productoHasPedidoPK.productoid = :productoid"),
    @NamedQuery(name = "ProductoHasPedido.findByPedidoid", query = "SELECT p FROM ProductoHasPedido p WHERE p.productoHasPedidoPK.pedidoid = :pedidoid"),
    @NamedQuery(name = "ProductoHasPedido.findByCantidad", query = "SELECT p FROM ProductoHasPedido p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "ProductoHasPedido.findByBaja", query = "SELECT p FROM ProductoHasPedido p WHERE p.baja = :baja")})
public class ProductoHasPedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoHasPedidoPK productoHasPedidoPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "baja")
    private boolean baja;
    @JoinColumn(name = "Pedido_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pedido pedido;
    @JoinColumn(name = "Producto_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public ProductoHasPedido() {
    }

    public ProductoHasPedido(ProductoHasPedidoPK productoHasPedidoPK) {
        this.productoHasPedidoPK = productoHasPedidoPK;
    }

    public ProductoHasPedido(ProductoHasPedidoPK productoHasPedidoPK, boolean baja) {
        this.productoHasPedidoPK = productoHasPedidoPK;
        this.baja = baja;
    }

    public ProductoHasPedido(int productoid, int pedidoid) {
        this.productoHasPedidoPK = new ProductoHasPedidoPK(productoid, pedidoid);
    }

    public ProductoHasPedidoPK getProductoHasPedidoPK() {
        return productoHasPedidoPK;
    }

    public void setProductoHasPedidoPK(ProductoHasPedidoPK productoHasPedidoPK) {
        this.productoHasPedidoPK = productoHasPedidoPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public boolean getBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoHasPedidoPK != null ? productoHasPedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoHasPedido)) {
            return false;
        }
        ProductoHasPedido other = (ProductoHasPedido) object;
        if ((this.productoHasPedidoPK == null && other.productoHasPedidoPK != null) || (this.productoHasPedidoPK != null && !this.productoHasPedidoPK.equals(other.productoHasPedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.ProductoHasPedido[ productoHasPedidoPK=" + productoHasPedidoPK + " ]";
    }
    
}

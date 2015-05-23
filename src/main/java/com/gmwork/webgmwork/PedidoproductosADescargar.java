/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmwork.webgmwork;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mateo
 */
@Entity
@Table(name = "pedidoproductos_a_descargar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoproductosADescargar.findAll", query = "SELECT p FROM PedidoproductosADescargar p"),
    @NamedQuery(name = "PedidoproductosADescargar.findByProductoid", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.productoid = :productoid"),
    @NamedQuery(name = "PedidoproductosADescargar.findByPedidoid", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.pedidoid = :pedidoid"),
    @NamedQuery(name = "PedidoproductosADescargar.findByCantidad", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "PedidoproductosADescargar.findByIdPedidoProductoLog", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.idPedidoProductoLog = :idPedidoProductoLog"),
    @NamedQuery(name = "PedidoproductosADescargar.findByOp", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.op = :op"),
    @NamedQuery(name = "PedidoproductosADescargar.findByFecha", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "PedidoproductosADescargar.findByIdProducto", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "PedidoproductosADescargar.findByIdPedido", query = "SELECT p FROM PedidoproductosADescargar p WHERE p.idPedido = :idPedido")})
public class PedidoproductosADescargar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Producto_id")
    private int productoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pedido_id")
    private int pedidoid;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPedidoProductoLog")
    private int idPedidoProductoLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "id_Producto")
    private String idProducto;
    @Column(name = "id_Pedido")
    @Id
    private Integer idPedido;
    

    public PedidoproductosADescargar() {
    }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public int getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(int pedidoid) {
        this.pedidoid = pedidoid;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdPedidoProductoLog() {
        return idPedidoProductoLog;
    }

    public void setIdPedidoProductoLog(int idPedidoProductoLog) {
        this.idPedidoProductoLog = idPedidoProductoLog;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    
    
}

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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "pedidoproductolog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidoproductolog.findAll", query = "SELECT p FROM Pedidoproductolog p"),
    @NamedQuery(name = "Pedidoproductolog.findByIdPedidoProductoLog", query = "SELECT p FROM Pedidoproductolog p WHERE p.idPedidoProductoLog = :idPedidoProductoLog"),
    @NamedQuery(name = "Pedidoproductolog.findByOp", query = "SELECT p FROM Pedidoproductolog p WHERE p.op = :op"),
    @NamedQuery(name = "Pedidoproductolog.findByFecha", query = "SELECT p FROM Pedidoproductolog p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pedidoproductolog.findByIdProducto", query = "SELECT p FROM Pedidoproductolog p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Pedidoproductolog.findByIdPedido", query = "SELECT p FROM Pedidoproductolog p WHERE p.idPedido = :idPedido")})
public class Pedidoproductolog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPedidoProductoLog")
    private Integer idPedidoProductoLog;
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
    private Integer idPedido;

    public Pedidoproductolog() {
    }

    public Pedidoproductolog(Integer idPedidoProductoLog) {
        this.idPedidoProductoLog = idPedidoProductoLog;
    }

    public Pedidoproductolog(Integer idPedidoProductoLog, String idProducto) {
        this.idPedidoProductoLog = idPedidoProductoLog;
        this.idProducto = idProducto;
    }

    public Integer getIdPedidoProductoLog() {
        return idPedidoProductoLog;
    }

    public void setIdPedidoProductoLog(Integer idPedidoProductoLog) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedidoProductoLog != null ? idPedidoProductoLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidoproductolog)) {
            return false;
        }
        Pedidoproductolog other = (Pedidoproductolog) object;
        if ((this.idPedidoProductoLog == null && other.idPedidoProductoLog != null) || (this.idPedidoProductoLog != null && !this.idPedidoProductoLog.equals(other.idPedidoProductoLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.Pedidoproductolog[ idPedidoProductoLog=" + idPedidoProductoLog + " ]";
    }
    
}

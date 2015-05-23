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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mateo
 */
@Entity
@Table(name = "pedidolog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidolog.findAll", query = "SELECT p FROM Pedidolog p"),
    @NamedQuery(name = "Pedidolog.findByIdPedidoLog", query = "SELECT p FROM Pedidolog p WHERE p.idPedidoLog = :idPedidoLog"),
    @NamedQuery(name = "Pedidolog.findByOp", query = "SELECT p FROM Pedidolog p WHERE p.op = :op"),
    @NamedQuery(name = "Pedidolog.findByFecha", query = "SELECT p FROM Pedidolog p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pedidolog.findByIdUsuario", query = "SELECT p FROM Pedidolog p WHERE p.idUsuario = :idUsuario"),
    @NamedQuery(name = "Pedidolog.findByIdPedido", query = "SELECT p FROM Pedidolog p WHERE p.idPedido = :idPedido")})
public class Pedidolog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPedidoLog")
    private Integer idPedidoLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "idPedido")
    private Integer idPedido;

    public Pedidolog() {
    }

    public Pedidolog(Integer idPedidoLog) {
        this.idPedidoLog = idPedidoLog;
    }

    public Integer getIdPedidoLog() {
        return idPedidoLog;
    }

    public void setIdPedidoLog(Integer idPedidoLog) {
        this.idPedidoLog = idPedidoLog;
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

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
        hash += (idPedidoLog != null ? idPedidoLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidolog)) {
            return false;
        }
        Pedidolog other = (Pedidolog) object;
        if ((this.idPedidoLog == null && other.idPedidoLog != null) || (this.idPedidoLog != null && !this.idPedidoLog.equals(other.idPedidoLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.Pedidolog[ idPedidoLog=" + idPedidoLog + " ]";
    }
    
}

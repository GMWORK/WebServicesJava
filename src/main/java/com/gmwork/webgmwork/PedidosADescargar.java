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
@Table(name = "pedidos_a_descargar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidosADescargar.findAll", query = "SELECT p FROM PedidosADescargar p"),
    @NamedQuery(name = "PedidosADescargar.findById", query = "SELECT p FROM PedidosADescargar p WHERE p.id = :id"),
    @NamedQuery(name = "PedidosADescargar.findByFechaEntrega", query = "SELECT p FROM PedidosADescargar p WHERE p.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "PedidosADescargar.findByEstado", query = "SELECT p FROM PedidosADescargar p WHERE p.estado = :estado"),
    @NamedQuery(name = "PedidosADescargar.findByClienteid", query = "SELECT p FROM PedidosADescargar p WHERE p.clienteid = :clienteid"),
    @NamedQuery(name = "PedidosADescargar.findByTotal", query = "SELECT p FROM PedidosADescargar p WHERE p.total = :total"),
    @NamedQuery(name = "PedidosADescargar.findByIdPedidoLog", query = "SELECT p FROM PedidosADescargar p WHERE p.idPedidoLog = :idPedidoLog"),
    @NamedQuery(name = "PedidosADescargar.findByOp", query = "SELECT p FROM PedidosADescargar p WHERE p.op = :op"),
    @NamedQuery(name = "PedidosADescargar.findByFecha", query = "SELECT p FROM PedidosADescargar p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "PedidosADescargar.findByIdUsuario", query = "SELECT p FROM PedidosADescargar p WHERE p.idUsuario = :idUsuario"),
    @NamedQuery(name = "PedidosADescargar.findByIdPedido", query = "SELECT p FROM PedidosADescargar p WHERE p.idPedido = :idPedido")})
public class PedidosADescargar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaEntrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cliente_id")
    private int clienteid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Total")
    private Double total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPedidoLog")
    private int idPedidoLog;
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

    public PedidosADescargar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getIdPedidoLog() {
        return idPedidoLog;
    }

    public void setIdPedidoLog(int idPedidoLog) {
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
    
}

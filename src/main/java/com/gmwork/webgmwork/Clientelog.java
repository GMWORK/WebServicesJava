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
@Table(name = "clientelog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientelog.findAll", query = "SELECT c FROM Clientelog c"),
    @NamedQuery(name = "Clientelog.findByIdClienteLog", query = "SELECT c FROM Clientelog c WHERE c.idClienteLog = :idClienteLog"),
    @NamedQuery(name = "Clientelog.findByFecha", query = "SELECT c FROM Clientelog c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Clientelog.findByOp", query = "SELECT c FROM Clientelog c WHERE c.op = :op"),
    @NamedQuery(name = "Clientelog.findByIdCliente", query = "SELECT c FROM Clientelog c WHERE c.idCliente = :idCliente")})
public class Clientelog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClienteLog")
    private Integer idClienteLog;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Size(max = 45)
    @Column(name = "idCliente")
    private String idCliente;

    public Clientelog() {
    }

    public Clientelog(Integer idClienteLog) {
        this.idClienteLog = idClienteLog;
    }

    public Integer getIdClienteLog() {
        return idClienteLog;
    }

    public void setIdClienteLog(Integer idClienteLog) {
        this.idClienteLog = idClienteLog;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClienteLog != null ? idClienteLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientelog)) {
            return false;
        }
        Clientelog other = (Clientelog) object;
        if ((this.idClienteLog == null && other.idClienteLog != null) || (this.idClienteLog != null && !this.idClienteLog.equals(other.idClienteLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.Clientelog[ idClienteLog=" + idClienteLog + " ]";
    }
    
}

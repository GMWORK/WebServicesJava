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
@Table(name = "productolog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productolog.findAll", query = "SELECT p FROM Productolog p"),
    @NamedQuery(name = "Productolog.findByIdProductoLog", query = "SELECT p FROM Productolog p WHERE p.idProductoLog = :idProductoLog"),
    @NamedQuery(name = "Productolog.findByOp", query = "SELECT p FROM Productolog p WHERE p.op = :op"),
    @NamedQuery(name = "Productolog.findByFecha", query = "SELECT p FROM Productolog p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Productolog.findByIdProducto", query = "SELECT p FROM Productolog p WHERE p.idProducto = :idProducto")})
public class Productolog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoLog")
    private Integer idProductoLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "IdProducto")
    private Integer idProducto;

    public Productolog() {
    }

    public Productolog(Integer idProductoLog) {
        this.idProductoLog = idProductoLog;
    }

    public Integer getIdProductoLog() {
        return idProductoLog;
    }

    public void setIdProductoLog(Integer idProductoLog) {
        this.idProductoLog = idProductoLog;
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

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoLog != null ? idProductoLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productolog)) {
            return false;
        }
        Productolog other = (Productolog) object;
        if ((this.idProductoLog == null && other.idProductoLog != null) || (this.idProductoLog != null && !this.idProductoLog.equals(other.idProductoLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.Productolog[ idProductoLog=" + idProductoLog + " ]";
    }
    
}

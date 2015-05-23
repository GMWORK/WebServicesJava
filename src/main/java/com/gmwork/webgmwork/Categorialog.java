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
@Table(name = "categorialog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorialog.findAll", query = "SELECT c FROM Categorialog c"),
    @NamedQuery(name = "Categorialog.findByIdCategoriaLog", query = "SELECT c FROM Categorialog c WHERE c.idCategoriaLog = :idCategoriaLog"),
    @NamedQuery(name = "Categorialog.findByOp", query = "SELECT c FROM Categorialog c WHERE c.op = :op"),
    @NamedQuery(name = "Categorialog.findByFecha", query = "SELECT c FROM Categorialog c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Categorialog.findByIdCategoria", query = "SELECT c FROM Categorialog c WHERE c.idCategoria = :idCategoria")})
public class Categorialog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCategoriaLog")
    private Integer idCategoriaLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "IdCategoria")
    private Integer idCategoria;

    public Categorialog() {
    }

    public Categorialog(Integer idCategoriaLog) {
        this.idCategoriaLog = idCategoriaLog;
    }

    public Integer getIdCategoriaLog() {
        return idCategoriaLog;
    }

    public void setIdCategoriaLog(Integer idCategoriaLog) {
        this.idCategoriaLog = idCategoriaLog;
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

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaLog != null ? idCategoriaLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorialog)) {
            return false;
        }
        Categorialog other = (Categorialog) object;
        if ((this.idCategoriaLog == null && other.idCategoriaLog != null) || (this.idCategoriaLog != null && !this.idCategoriaLog.equals(other.idCategoriaLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.Categorialog[ idCategoriaLog=" + idCategoriaLog + " ]";
    }
    
}

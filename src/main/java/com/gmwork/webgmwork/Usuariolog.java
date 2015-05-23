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
@Table(name = "usuariolog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuariolog.findAll", query = "SELECT u FROM Usuariolog u"),
    @NamedQuery(name = "Usuariolog.findByIdUsuarioLog", query = "SELECT u FROM Usuariolog u WHERE u.idUsuarioLog = :idUsuarioLog"),
    @NamedQuery(name = "Usuariolog.findByOp", query = "SELECT u FROM Usuariolog u WHERE u.op = :op"),
    @NamedQuery(name = "Usuariolog.findByFecha", query = "SELECT u FROM Usuariolog u WHERE u.fecha = :fecha"),
    @NamedQuery(name = "Usuariolog.findByIdUsuario", query = "SELECT u FROM Usuariolog u WHERE u.idUsuario = :idUsuario")})
public class Usuariolog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuarioLog")
    private Integer idUsuarioLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "idUsuario")
    private Integer idUsuario;

    public Usuariolog() {
    }

    public Usuariolog(Integer idUsuarioLog) {
        this.idUsuarioLog = idUsuarioLog;
    }

    public Integer getIdUsuarioLog() {
        return idUsuarioLog;
    }

    public void setIdUsuarioLog(Integer idUsuarioLog) {
        this.idUsuarioLog = idUsuarioLog;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioLog != null ? idUsuarioLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuariolog)) {
            return false;
        }
        Usuariolog other = (Usuariolog) object;
        if ((this.idUsuarioLog == null && other.idUsuarioLog != null) || (this.idUsuarioLog != null && !this.idUsuarioLog.equals(other.idUsuarioLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmwork.webgmwork.Usuariolog[ idUsuarioLog=" + idUsuarioLog + " ]";
    }
    
}

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
@Table(name = "usuario_a_descargar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioADescargar.findAll", query = "SELECT u FROM UsuarioADescargar u"),
    @NamedQuery(name = "UsuarioADescargar.findById", query = "SELECT u FROM UsuarioADescargar u WHERE u.id = :id"),
    @NamedQuery(name = "UsuarioADescargar.findByNif", query = "SELECT u FROM UsuarioADescargar u WHERE u.nif = :nif"),
    @NamedQuery(name = "UsuarioADescargar.findByNombre", query = "SELECT u FROM UsuarioADescargar u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "UsuarioADescargar.findByApellidos", query = "SELECT u FROM UsuarioADescargar u WHERE u.apellidos = :apellidos"),
    @NamedQuery(name = "UsuarioADescargar.findByCalle", query = "SELECT u FROM UsuarioADescargar u WHERE u.calle = :calle"),
    @NamedQuery(name = "UsuarioADescargar.findByPoblacion", query = "SELECT u FROM UsuarioADescargar u WHERE u.poblacion = :poblacion"),
    @NamedQuery(name = "UsuarioADescargar.findByAdministrador", query = "SELECT u FROM UsuarioADescargar u WHERE u.administrador = :administrador"),
    @NamedQuery(name = "UsuarioADescargar.findByUsername", query = "SELECT u FROM UsuarioADescargar u WHERE u.username = :username"),
    @NamedQuery(name = "UsuarioADescargar.findByPassword", query = "SELECT u FROM UsuarioADescargar u WHERE u.password = :password"),
    @NamedQuery(name = "UsuarioADescargar.findByIdUsuarioLog", query = "SELECT u FROM UsuarioADescargar u WHERE u.idUsuarioLog = :idUsuarioLog"),
    @NamedQuery(name = "UsuarioADescargar.findByOp", query = "SELECT u FROM UsuarioADescargar u WHERE u.op = :op"),
    @NamedQuery(name = "UsuarioADescargar.findByFecha", query = "SELECT u FROM UsuarioADescargar u WHERE u.fecha = :fecha"),
    @NamedQuery(name = "UsuarioADescargar.findByIdUsuario", query = "SELECT u FROM UsuarioADescargar u WHERE u.idUsuario = :idUsuario")})
public class UsuarioADescargar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nif")
    private String nif;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 50)
    @Column(name = "calle")
    private String calle;
    @Size(max = 45)
    @Column(name = "poblacion")
    private String poblacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "administrador")
    private boolean administrador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 700)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuarioLog")
    private int idUsuarioLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "idUsuario")
    private Integer idUsuario;

    public UsuarioADescargar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUsuarioLog() {
        return idUsuarioLog;
    }

    public void setIdUsuarioLog(int idUsuarioLog) {
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
    
}

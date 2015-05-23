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
import javax.persistence.Lob;
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
@Table(name = "cliente_a_descargar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClienteADescargar.findAll", query = "SELECT c FROM ClienteADescargar c"),
    @NamedQuery(name = "ClienteADescargar.findById", query = "SELECT c FROM ClienteADescargar c WHERE c.id = :id"),
    @NamedQuery(name = "ClienteADescargar.findByNif", query = "SELECT c FROM ClienteADescargar c WHERE c.nif = :nif"),
    @NamedQuery(name = "ClienteADescargar.findByNombre", query = "SELECT c FROM ClienteADescargar c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ClienteADescargar.findByApellidos", query = "SELECT c FROM ClienteADescargar c WHERE c.apellidos = :apellidos"),
    @NamedQuery(name = "ClienteADescargar.findByLongitud", query = "SELECT c FROM ClienteADescargar c WHERE c.longitud = :longitud"),
    @NamedQuery(name = "ClienteADescargar.findByLatitud", query = "SELECT c FROM ClienteADescargar c WHERE c.latitud = :latitud"),
    @NamedQuery(name = "ClienteADescargar.findByCalle", query = "SELECT c FROM ClienteADescargar c WHERE c.calle = :calle"),
    @NamedQuery(name = "ClienteADescargar.findByPoblacion", query = "SELECT c FROM ClienteADescargar c WHERE c.poblacion = :poblacion"),
    @NamedQuery(name = "ClienteADescargar.findByUsuarioid", query = "SELECT c FROM ClienteADescargar c WHERE c.usuarioid = :usuarioid"),
    @NamedQuery(name = "ClienteADescargar.findByProximaVisita", query = "SELECT c FROM ClienteADescargar c WHERE c.proximaVisita = :proximaVisita"),
    @NamedQuery(name = "ClienteADescargar.findByIdClienteLog", query = "SELECT c FROM ClienteADescargar c WHERE c.idClienteLog = :idClienteLog"),
    @NamedQuery(name = "ClienteADescargar.findByFecha", query = "SELECT c FROM ClienteADescargar c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "ClienteADescargar.findByOp", query = "SELECT c FROM ClienteADescargar c WHERE c.op = :op"),
    @NamedQuery(name = "ClienteADescargar.findByIdCliente", query = "SELECT c FROM ClienteADescargar c WHERE c.idCliente = :idCliente")})
public class ClienteADescargar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "nif")
    private String nif;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "longitud")
    private Double longitud;
    @Column(name = "latitud")
    private Double latitud;
    @Size(max = 60)
    @Column(name = "calle")
    private String calle;
    @Size(max = 40)
    @Column(name = "poblacion")
    private String poblacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_id")
    private int usuarioid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Proxima_Visita")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proximaVisita;
    @Lob
    @Column(name = "img")
    private byte[] img;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idClienteLog")
    private int idClienteLog;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Size(max = 45)
    @Column(name = "idCliente")
    private String idCliente;

    public ClienteADescargar() {
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

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
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

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public Date getProximaVisita() {
        return proximaVisita;
    }

    public void setProximaVisita(Date proximaVisita) {
        this.proximaVisita = proximaVisita;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public int getIdClienteLog() {
        return idClienteLog;
    }

    public void setIdClienteLog(int idClienteLog) {
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
    
}

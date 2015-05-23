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
@Table(name = "categorias_a_descargar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriasADescargar.findAll", query = "SELECT c FROM CategoriasADescargar c"),
    @NamedQuery(name = "CategoriasADescargar.findById", query = "SELECT c FROM CategoriasADescargar c WHERE c.id = :id"),
    @NamedQuery(name = "CategoriasADescargar.findByNombre", query = "SELECT c FROM CategoriasADescargar c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CategoriasADescargar.findByDescuento", query = "SELECT c FROM CategoriasADescargar c WHERE c.descuento = :descuento"),
    @NamedQuery(name = "CategoriasADescargar.findByIdCategoriaLog", query = "SELECT c FROM CategoriasADescargar c WHERE c.idCategoriaLog = :idCategoriaLog"),
    @NamedQuery(name = "CategoriasADescargar.findByOp", query = "SELECT c FROM CategoriasADescargar c WHERE c.op = :op"),
    @NamedQuery(name = "CategoriasADescargar.findByFecha", query = "SELECT c FROM CategoriasADescargar c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "CategoriasADescargar.findByIdCategoria", query = "SELECT c FROM CategoriasADescargar c WHERE c.idCategoria = :idCategoria")})
public class CategoriasADescargar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Double descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCategoriaLog")
    private int idCategoriaLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "IdCategoria")
    private Integer idCategoria;

    public CategoriasADescargar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public int getIdCategoriaLog() {
        return idCategoriaLog;
    }

    public void setIdCategoriaLog(int idCategoriaLog) {
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
    
}

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
@Table(name = "productos_a_descargar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosADescargar.findAll", query = "SELECT p FROM ProductosADescargar p"),
    @NamedQuery(name = "ProductosADescargar.findById", query = "SELECT p FROM ProductosADescargar p WHERE p.id = :id"),
    @NamedQuery(name = "ProductosADescargar.findByNombre", query = "SELECT p FROM ProductosADescargar p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "ProductosADescargar.findByPrecio", query = "SELECT p FROM ProductosADescargar p WHERE p.precio = :precio"),
    @NamedQuery(name = "ProductosADescargar.findByInhabilitats", query = "SELECT p FROM ProductosADescargar p WHERE p.inhabilitats = :inhabilitats"),
    @NamedQuery(name = "ProductosADescargar.findByDescuento", query = "SELECT p FROM ProductosADescargar p WHERE p.descuento = :descuento"),
    @NamedQuery(name = "ProductosADescargar.findByCategoriaid", query = "SELECT p FROM ProductosADescargar p WHERE p.categoriaid = :categoriaid"),
    @NamedQuery(name = "ProductosADescargar.findByIdProductoLog", query = "SELECT p FROM ProductosADescargar p WHERE p.idProductoLog = :idProductoLog"),
    @NamedQuery(name = "ProductosADescargar.findByOp", query = "SELECT p FROM ProductosADescargar p WHERE p.op = :op"),
    @NamedQuery(name = "ProductosADescargar.findByFecha", query = "SELECT p FROM ProductosADescargar p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "ProductosADescargar.findByIdProducto", query = "SELECT p FROM ProductosADescargar p WHERE p.idProducto = :idProducto")})
public class ProductosADescargar implements Serializable {
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
    @Column(name = "precio")
    private Double precio;
    @Lob
    @Column(name = "img")
    private byte[] img;
    @Column(name = "inhabilitats")
    private Boolean inhabilitats;
    @Column(name = "descuento")
    private Double descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Categoria_id")
    private int categoriaid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProductoLog")
    private int idProductoLog;
    @Size(max = 45)
    @Column(name = "Op")
    private String op;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "IdProducto")
    private Integer idProducto;

    public ProductosADescargar() {
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public Boolean getInhabilitats() {
        return inhabilitats;
    }

    public void setInhabilitats(Boolean inhabilitats) {
        this.inhabilitats = inhabilitats;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public int getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(int categoriaid) {
        this.categoriaid = categoriaid;
    }

    public int getIdProductoLog() {
        return idProductoLog;
    }

    public void setIdProductoLog(int idProductoLog) {
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
    
}

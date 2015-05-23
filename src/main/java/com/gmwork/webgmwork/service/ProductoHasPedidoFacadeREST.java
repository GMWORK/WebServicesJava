/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmwork.webgmwork.service;

import com.gmwork.webgmwork.ProductoHasPedido;
import com.gmwork.webgmwork.ProductoHasPedidoPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Mateo
 */
@Stateless
@Path("productohaspedido")
public class ProductoHasPedidoFacadeREST extends AbstractFacade<ProductoHasPedido> {
    @PersistenceContext(unitName = "com.mycompany_WebGMWORK_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private ProductoHasPedidoPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;productoid=productoidValue;pedidoid=pedidoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.gmwork.webgmwork.ProductoHasPedidoPK key = new com.gmwork.webgmwork.ProductoHasPedidoPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> productoid = map.get("productoid");
        if (productoid != null && !productoid.isEmpty()) {
            key.setProductoid(new java.lang.Integer(productoid.get(0)));
        }
        java.util.List<String> pedidoid = map.get("pedidoid");
        if (pedidoid != null && !pedidoid.isEmpty()) {
            key.setPedidoid(new java.lang.Integer(pedidoid.get(0)));
        }
        return key;
    }

    public ProductoHasPedidoFacadeREST() {
        super(ProductoHasPedido.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(ProductoHasPedido entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, ProductoHasPedido entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.gmwork.webgmwork.ProductoHasPedidoPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public ProductoHasPedido find(@PathParam("id") PathSegment id) {
        com.gmwork.webgmwork.ProductoHasPedidoPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<ProductoHasPedido> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<ProductoHasPedido> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmwork.webgmwork.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Mateo
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.gmwork.webgmwork.GenericResource.class);
        resources.add(com.gmwork.webgmwork.service.CategoriaFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.CategorialogFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.CategoriasADescargarFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ClienteADescargarFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ClienteFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ClientelogFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.PedidoFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.PedidologFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.PedidoproductologFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.PedidoproductosADescargarFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.PedidosADescargarFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ProductoFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ProductoHasPedidoFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ProductologFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.ProductosADescargarFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.UsuarioADescargarFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.UsuarioFacadeREST.class);
        resources.add(com.gmwork.webgmwork.service.UsuariologFacadeREST.class);
    }
    
}

package com.catastro.entities;
// Generated 29-abr-2015 22:21:01 by Hibernate Tools 3.6.0



/**
 * Contenedor generated by hbm2java
 */
public class Contenedor  implements java.io.Serializable {


     private long idcontenedor;
     private Fichacatastral fichacatastral;
     private Integer codigo;
     private Integer subcodigo;
     private String nombre;
     private String descripcion;
     private Boolean estado;

    public Contenedor() {
    }

	
    public Contenedor(long idcontenedor) {
        this.idcontenedor = idcontenedor;
    }
    public Contenedor(long idcontenedor, Fichacatastral fichacatastral, Integer codigo, Integer subcodigo, String nombre, String descripcion, Boolean estado) {
       this.idcontenedor = idcontenedor;
       this.fichacatastral = fichacatastral;
       this.codigo = codigo;
       this.subcodigo = subcodigo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.estado = estado;
    }
   
    public long getIdcontenedor() {
        return this.idcontenedor;
    }
    
    public void setIdcontenedor(long idcontenedor) {
        this.idcontenedor = idcontenedor;
    }
    public Fichacatastral getFichacatastral() {
        return this.fichacatastral;
    }
    
    public void setFichacatastral(Fichacatastral fichacatastral) {
        this.fichacatastral = fichacatastral;
    }
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getSubcodigo() {
        return this.subcodigo;
    }
    
    public void setSubcodigo(Integer subcodigo) {
        this.subcodigo = subcodigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }




}



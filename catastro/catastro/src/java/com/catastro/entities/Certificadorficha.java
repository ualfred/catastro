package com.catastro.entities;
// Generated 29-abr-2015 22:21:01 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Certificadorficha generated by hbm2java
 */
public class Certificadorficha  implements java.io.Serializable {


     private long idcertificadorficha;
     private Fichacatastral fichacatastral;
     private String tipovinculo;
     private String dni;
     private String nombre;
     private String apellidos;
     private Date fecha;
     private String nroregistro;

    public Certificadorficha() {
    }

	
    public Certificadorficha(long idcertificadorficha) {
        this.idcertificadorficha = idcertificadorficha;
    }
    public Certificadorficha(long idcertificadorficha, Fichacatastral fichacatastral, String tipovinculo, String dni, String nombre, String apellidos, Date fecha, String nroregistro) {
       this.idcertificadorficha = idcertificadorficha;
       this.fichacatastral = fichacatastral;
       this.tipovinculo = tipovinculo;
       this.dni = dni;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fecha = fecha;
       this.nroregistro = nroregistro;
    }
   
    public long getIdcertificadorficha() {
        return this.idcertificadorficha;
    }
    
    public void setIdcertificadorficha(long idcertificadorficha) {
        this.idcertificadorficha = idcertificadorficha;
    }
    public Fichacatastral getFichacatastral() {
        return this.fichacatastral;
    }
    
    public void setFichacatastral(Fichacatastral fichacatastral) {
        this.fichacatastral = fichacatastral;
    }
    public String getTipovinculo() {
        return this.tipovinculo;
    }
    
    public void setTipovinculo(String tipovinculo) {
        this.tipovinculo = tipovinculo;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getNroregistro() {
        return this.nroregistro;
    }
    
    public void setNroregistro(String nroregistro) {
        this.nroregistro = nroregistro;
    }




}



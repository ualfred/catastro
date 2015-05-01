package com.catastro.entities;
// Generated 29-abr-2015 22:21:01 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Titular generated by hbm2java
 */
public class Titular  implements java.io.Serializable {


     private long idtitular;
     private String nrodocid;
     private String nombre;
     private String apellpaterno;
     private String apellmaterno;
     private String nroducruc;
     private String razonsocial;
     private Set<Fichacatastral> fichacatastrals = new HashSet<Fichacatastral>(0);

    public Titular() {
    }

	
    public Titular(long idtitular) {
        this.idtitular = idtitular;
    }
    public Titular(long idtitular, String nrodocid, String nombre, String apellpaterno, String apellmaterno, String nroducruc, String razonsocial, Set<Fichacatastral> fichacatastrals) {
       this.idtitular = idtitular;
       this.nrodocid = nrodocid;
       this.nombre = nombre;
       this.apellpaterno = apellpaterno;
       this.apellmaterno = apellmaterno;
       this.nroducruc = nroducruc;
       this.razonsocial = razonsocial;
       this.fichacatastrals = fichacatastrals;
    }
   
    public long getIdtitular() {
        return this.idtitular;
    }
    
    public void setIdtitular(long idtitular) {
        this.idtitular = idtitular;
    }
    public String getNrodocid() {
        return this.nrodocid;
    }
    
    public void setNrodocid(String nrodocid) {
        this.nrodocid = nrodocid;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellpaterno() {
        return this.apellpaterno;
    }
    
    public void setApellpaterno(String apellpaterno) {
        this.apellpaterno = apellpaterno;
    }
    public String getApellmaterno() {
        return this.apellmaterno;
    }
    
    public void setApellmaterno(String apellmaterno) {
        this.apellmaterno = apellmaterno;
    }
    public String getNroducruc() {
        return this.nroducruc;
    }
    
    public void setNroducruc(String nroducruc) {
        this.nroducruc = nroducruc;
    }
    public String getRazonsocial() {
        return this.razonsocial;
    }
    
    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }
    public Set<Fichacatastral> getFichacatastrals() {
        return this.fichacatastrals;
    }
    
    public void setFichacatastrals(Set<Fichacatastral> fichacatastrals) {
        this.fichacatastrals = fichacatastrals;
    }




}



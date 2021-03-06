package com.catastro.entities;
// Generated 29-abr-2015 22:21:01 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Incrprediocatastral generated by hbm2java
 */
public class Incrprediocatastral  implements java.io.Serializable {


     private long idincrprediocatastral;
     private Fichaindividual fichaindividual;
     private String numero;
     private String fojas;
     private Integer asiento;
     private Date fechaincrippredio;
     private Integer asincfabrica;
     private Date fechaincfabrica;
     private Integer tipopartidaregistral;
     private Integer declaratoriafabrica;

    public Incrprediocatastral() {
    }

	
    public Incrprediocatastral(long idincrprediocatastral) {
        this.idincrprediocatastral = idincrprediocatastral;
    }
    public Incrprediocatastral(long idincrprediocatastral, Fichaindividual fichaindividual, String numero, String fojas, Integer asiento, Date fechaincrippredio, Integer asincfabrica, Date fechaincfabrica, Integer tipopartidaregistral, Integer declaratoriafabrica) {
       this.idincrprediocatastral = idincrprediocatastral;
       this.fichaindividual = fichaindividual;
       this.numero = numero;
       this.fojas = fojas;
       this.asiento = asiento;
       this.fechaincrippredio = fechaincrippredio;
       this.asincfabrica = asincfabrica;
       this.fechaincfabrica = fechaincfabrica;
       this.tipopartidaregistral = tipopartidaregistral;
       this.declaratoriafabrica = declaratoriafabrica;
    }
   
    public long getIdincrprediocatastral() {
        return this.idincrprediocatastral;
    }
    
    public void setIdincrprediocatastral(long idincrprediocatastral) {
        this.idincrprediocatastral = idincrprediocatastral;
    }
    public Fichaindividual getFichaindividual() {
        return this.fichaindividual;
    }
    
    public void setFichaindividual(Fichaindividual fichaindividual) {
        this.fichaindividual = fichaindividual;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getFojas() {
        return this.fojas;
    }
    
    public void setFojas(String fojas) {
        this.fojas = fojas;
    }
    public Integer getAsiento() {
        return this.asiento;
    }
    
    public void setAsiento(Integer asiento) {
        this.asiento = asiento;
    }
    public Date getFechaincrippredio() {
        return this.fechaincrippredio;
    }
    
    public void setFechaincrippredio(Date fechaincrippredio) {
        this.fechaincrippredio = fechaincrippredio;
    }
    public Integer getAsincfabrica() {
        return this.asincfabrica;
    }
    
    public void setAsincfabrica(Integer asincfabrica) {
        this.asincfabrica = asincfabrica;
    }
    public Date getFechaincfabrica() {
        return this.fechaincfabrica;
    }
    
    public void setFechaincfabrica(Date fechaincfabrica) {
        this.fechaincfabrica = fechaincfabrica;
    }
    public Integer getTipopartidaregistral() {
        return this.tipopartidaregistral;
    }
    
    public void setTipopartidaregistral(Integer tipopartidaregistral) {
        this.tipopartidaregistral = tipopartidaregistral;
    }
    public Integer getDeclaratoriafabrica() {
        return this.declaratoriafabrica;
    }
    
    public void setDeclaratoriafabrica(Integer declaratoriafabrica) {
        this.declaratoriafabrica = declaratoriafabrica;
    }




}



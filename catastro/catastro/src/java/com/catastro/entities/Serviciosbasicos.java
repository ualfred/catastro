package com.catastro.entities;
// Generated 29-abr-2015 22:21:01 by Hibernate Tools 3.6.0



/**
 * Serviciosbasicos generated by hbm2java
 */
public class Serviciosbasicos  implements java.io.Serializable {


     private int idserviciosbasicos;
     private Fichaindividual fichaindividual;
     private String luz;
     private String agua;
     private String telefono;
     private String desague;
     private String nrosumluz;
     private String nrocontratoagua;
     private String nrotelefono;

    public Serviciosbasicos() {
    }

	
    public Serviciosbasicos(int idserviciosbasicos) {
        this.idserviciosbasicos = idserviciosbasicos;
    }
    public Serviciosbasicos(int idserviciosbasicos, Fichaindividual fichaindividual, String luz, String agua, String telefono, String desague, String nrosumluz, String nrocontratoagua, String nrotelefono) {
       this.idserviciosbasicos = idserviciosbasicos;
       this.fichaindividual = fichaindividual;
       this.luz = luz;
       this.agua = agua;
       this.telefono = telefono;
       this.desague = desague;
       this.nrosumluz = nrosumluz;
       this.nrocontratoagua = nrocontratoagua;
       this.nrotelefono = nrotelefono;
    }
   
    public int getIdserviciosbasicos() {
        return this.idserviciosbasicos;
    }
    
    public void setIdserviciosbasicos(int idserviciosbasicos) {
        this.idserviciosbasicos = idserviciosbasicos;
    }
    public Fichaindividual getFichaindividual() {
        return this.fichaindividual;
    }
    
    public void setFichaindividual(Fichaindividual fichaindividual) {
        this.fichaindividual = fichaindividual;
    }
    public String getLuz() {
        return this.luz;
    }
    
    public void setLuz(String luz) {
        this.luz = luz;
    }
    public String getAgua() {
        return this.agua;
    }
    
    public void setAgua(String agua) {
        this.agua = agua;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDesague() {
        return this.desague;
    }
    
    public void setDesague(String desague) {
        this.desague = desague;
    }
    public String getNrosumluz() {
        return this.nrosumluz;
    }
    
    public void setNrosumluz(String nrosumluz) {
        this.nrosumluz = nrosumluz;
    }
    public String getNrocontratoagua() {
        return this.nrocontratoagua;
    }
    
    public void setNrocontratoagua(String nrocontratoagua) {
        this.nrocontratoagua = nrocontratoagua;
    }
    public String getNrotelefono() {
        return this.nrotelefono;
    }
    
    public void setNrotelefono(String nrotelefono) {
        this.nrotelefono = nrotelefono;
    }




}



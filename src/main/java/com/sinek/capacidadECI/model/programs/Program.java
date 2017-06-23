/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.programs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sinek.capacidadECI.model.subject.Materia;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author henry
 */
@Entity
public class Program implements java.io.Serializable {
    
    @Id     
    private String _id;
    
    private String nombre;
    //private String mnemonico;
    private float pAdmitidos;
    private float pMatriculados;
    private float pPermanencia;
    //private List<Materia> materias;
    
    /*Histórico*/    
    @ElementCollection
    @OrderColumn(name = "start")
    private List<Permanencia> permanencia;    
    
    @ElementCollection
    @OrderColumn(name = "year")
    private List<Historico> historico;    
  
    
    public Program(){
        super();
    }
    
    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public String getMnemonico() {
//        return mnemonico;
//    }
//
//    public void setMnemonico(String mnemonico) {
//        this.mnemonico = mnemonico;
//    }
    
    @JsonIgnore
    public List<Materia> getMaterias() {
        return null;//materias;
    }
    
    public Materia getMateriaPorId(String id){        
//        for (Materia m:materias){
//            if(m.getMnemonico().equalsIgnoreCase(id))
//                return m;
//        }
          return null;
    }
    
    @JsonIgnore
    public List<Permanencia> getPermanencia() {
        return permanencia;
    }    

    
    @JsonIgnore
    public List<Historico> getHistorico() {
        return historico;
    }


    public float getpAdmitidos() {
        return pAdmitidos; //Pendiente calcular
    }

    public float getpMatriculados() {
        return pMatriculados;
    }

    public float getpPermanencia() {
        return pPermanencia;
    }

    public void setpAdmitidos(float pAdmitidos) {
        this.pAdmitidos = pAdmitidos;
    }

    public void setpMatriculados(float pMatriculados) {
        this.pMatriculados = pMatriculados;
    }

    public void setpPermanencia(float pPermanencia) {
        this.pPermanencia = pPermanencia;
    }

    public void setMaterias(List<Materia> materias) {
        //this.materias = materias;
    }

    public void setPermanencia(List<Permanencia> permanencia) {
        this.permanencia = permanencia;
    }

   

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }

   
}

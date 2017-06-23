/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.subject;

import java.util.List;

/**
 *
 * @author henry
 */
public class Materia implements java.io.Serializable{
    
    private String nombre;
    private String mnemonico;
    private String programId;
    private List<Maternidad> maternidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMnemonico() {
        return mnemonico;
    }

    public void setMnemonico(String mnemonico) {
        this.mnemonico = mnemonico;
    }

    public List<Maternidad> getMaternidad() {
        return maternidad;
    }

    
    
    
    
}

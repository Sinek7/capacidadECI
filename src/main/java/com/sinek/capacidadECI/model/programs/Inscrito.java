/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.programs;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author henry
 */
@Embeddable
public class Inscrito implements java.io.Serializable {    
        
    private int year; 
    private int inscritos1;
    private int inscritos2;
    
    public Inscrito(){
        super();    
    }
   
    public int getAño() {
        return year;
    }
   

    public int getInscritos1() {
        return inscritos1;
    }

    public int getInscritos2() {
        return inscritos2;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setInscritos1(int inscritos1) {
        this.inscritos1 = inscritos1;
    }

    public void setInscritos2(int inscritos2) {
        this.inscritos2 = inscritos2;
    }
    
    
}

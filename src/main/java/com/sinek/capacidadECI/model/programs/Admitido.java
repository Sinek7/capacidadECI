/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.programs;

import javax.persistence.Embeddable;

/**
 *
 * @author henry
 */
@Embeddable
public class Admitido implements java.io.Serializable{
    private int year;    
    private int admitidos1;
    private int admitidos2;
    
    public Admitido(){
        super();
    }

    public int getAño() {
        return year;
    }


    public int getAdmitidos1() {
        return admitidos1;
    }

    public int getAdmitidos2() {
        return admitidos2;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAdmitidos1(int admitidos1) {
        this.admitidos1 = admitidos1;
    }

    public void setAdmitidos2(int admitidos2) {
        this.admitidos2 = admitidos2;
    }
    

    
}

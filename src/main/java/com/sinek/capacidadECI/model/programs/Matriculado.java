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
public class Matriculado implements java.io.Serializable{
    private int year;     
    private int matriculados1;
    private int matriculados2;
    
    public Matriculado(){
        super();
    }

    public int getAño() {
        return year;
    }

    public int getMatriculados1() {
        return matriculados1;
    }

    public int getMatriculados2() {
        return matriculados2;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMatriculados1(int matriculados1) {
        this.matriculados1 = matriculados1;
    }

    public void setMatriculados2(int matriculados2) {
        this.matriculados2 = matriculados2;
    }
    
    
}

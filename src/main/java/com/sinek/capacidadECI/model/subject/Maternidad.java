/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.subject;

/**
 *
 * @author henry
 */
public class Maternidad implements java.io.Serializable{
    
    private int año; 
    private int semestre1;
    private int semestre2;
    private String inter;
    private float tasa1; //Tasa de aprobación semestre 1
    private float tasa2;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getSemestre1() {
        return semestre1;
    }

    public void setSemestre1(int semestre1) {
        this.semestre1 = semestre1;
    }

    public int getSemestre2() {
        return semestre2;
    }

    public void setSemestre2(int semestre2) {
        this.semestre2 = semestre2;
    }

    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    public float getTasa1() {
        return tasa1;
    }

    public void setTasa1(float tasa1) {
        this.tasa1 = tasa1;
    }

    public float getTasa2() {
        return tasa2;
    }

    public void setTasa2(float tasa2) {
        this.tasa2 = tasa2;
    }

   
    
    
    
}

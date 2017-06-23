/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.programs;

/**
 *
 * @author henry
 */
public class Historico implements java.io.Serializable{
    private int year;
    private int inscritos1;
    private int inscritos2;    
    private int admitidos1;
    private int admitidos2;
    private int matriculados1;
    private int matriculados2;
    private float pAdm1;
    private float pMat1;
    private float pAdm2;
    private float pMat2;

    public float getpAdm2() {
        return pAdm2;
    }

    public void setpAdm2(float pAdm2) {
        this.pAdm2 = pAdm2;
    }

    public float getpMat2() {
        return pMat2;
    }

    public void setpMat2(float pMat2) {
        this.pMat2 = pMat2;
    }


    public float getpAdm1() {
        return pAdm1;
    }

    public void setpAdm1(float pAdm1) {
        this.pAdm1 = pAdm1;
    }

    public float getpMat1() {
        return pMat1;
    }

    public void setpMat1(float pMat1) {
        this.pMat1 = pMat1;
    }
    
    public Historico(){
        super();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInscritos1() {
        return inscritos1;
    }

    public void setInscritos1(int inscritos1) {
        this.inscritos1 = inscritos1;
    }

    public int getInscritos2() {
        return inscritos2;
    }

    public void setInscritos2(int inscritos2) {
        this.inscritos2 = inscritos2;
    }

    public int getAdmitidos1() {
        return admitidos1;
    }

    public void setAdmitidos1(int admitidos1) {
        this.admitidos1 = admitidos1;
    }

    public int getAdmitidos2() {
        return admitidos2;
    }

    public void setAdmitidos2(int admitidos2) {
        this.admitidos2 = admitidos2;
    }

    public int getMatriculados1() {
        return matriculados1;
    }

    public void setMatriculados1(int matriculados1) {
        this.matriculados1 = matriculados1;
    }

    public int getMatriculados2() {
        return matriculados2;
    }

    public void setMatriculados2(int matriculados2) {
        this.matriculados2 = matriculados2;
    }
    
    
}

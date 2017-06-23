/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model;

import com.sinek.capacidadECI.model.programs.Admitido;
import com.sinek.capacidadECI.model.programs.Historico;
import com.sinek.capacidadECI.model.programs.Inscrito;
import com.sinek.capacidadECI.model.programs.Matriculado;
import com.sinek.capacidadECI.model.programs.Permanencia;
import com.sinek.capacidadECI.model.programs.Program;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henry
 */
public class Data {
    private static List<Program> programs=new ArrayList<>();
    
    public static void setUpPrograms(String id, String name){
        Program p=new Program();
        p.setId(id);
        p.setNombre(name);
        p.setpAdmitidos((float) 0.9);
        p.setpMatriculados((float)0.3);
        p.setpPermanencia((float)0.89);
        
        List<Permanencia> permanencia=new ArrayList<>();
        List<Historico> historico=new ArrayList<>();
                
        for(int i=1;i<=21;i++){
            Permanencia per=new Permanencia();
            Historico his=new Historico();            
            if(i<10){
                per.setStart(i);
                per.setEnd(i+1);
                per.setPermanence(50+i);
                permanencia.add(per);
            }
            his.setYear(2000+i);
            his.setInscritos1(123*i);            
            his.setInscritos2(87*i);
            his.setAdmitidos1(86*i);
            his.setAdmitidos2(60*i);
            his.setMatriculados1(43*i);
            his.setMatriculados2(30*i);
            
            his.setpAdm1(his.getAdmitidos1()/his.getInscritos1());
            his.setpMat1(his.getMatriculados1()/his.getAdmitidos1());
            
            his.setpAdm1(his.getAdmitidos2()/his.getInscritos2());
            his.setpMat1(his.getMatriculados2()/his.getAdmitidos2());
            historico.add(his);
        }
        
        p.setPermanencia(permanencia);
        p.setHistorico(historico);
        
        programs.add(p);
    }
    
    public static List<Program> getPrograms(){
        return programs;
    }
    
    public static Program getProgramById(String id){
        for(Program p:programs){
            if(p.getId().equalsIgnoreCase(id))
                return p;
        }
        return null;
    }
    
}

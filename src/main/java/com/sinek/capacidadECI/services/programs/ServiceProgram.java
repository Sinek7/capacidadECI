/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.services.programs;


import com.sinek.capacidadECI.model.Data;
import com.sinek.capacidadECI.model.programs.Admitido;
import com.sinek.capacidadECI.model.programs.Historico;
import com.sinek.capacidadECI.model.programs.Inscrito;
import com.sinek.capacidadECI.model.programs.Matriculado;
import com.sinek.capacidadECI.model.programs.Permanencia;
import com.sinek.capacidadECI.model.programs.Program;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author henry
 */
//@Service
public class ServiceProgram implements IServiceProgram {
    //@Autowired    
    //StudentRepository student;
    //private List<Program> programs=new ArrayList<>();
    
    public ServiceProgram(){
        //Data.setUpPrograms("ISIS", "Ingeniería de Sistemas");        
        //programs=Data.getPrograms();
//        ProgramDB.setUpEntityManagerFactory();
//        EntityManager em=ProgramDB.getEntityManagerFactory().createEntityManager();
//        em.getTransaction().begin();
//        programs=em.createQuery("select p from Program p", Program.class).getResultList();
//        em.getTransaction().commit();
//        em.close();
        
    }
    
    @Override
    public List<Program> getPrograms() {
        //EntityManagerFactory emf=Persistence.createEntityManagerFactory("UnidadOGM");
        //System.out.println("$$$$$$$$$$"+emf);
        //EntityManager em=emf.createEntityManager();
        //em.getTransaction().begin();
        //programs=em.createQuery("select p from Program p", Program.class).getResultList();        
        //em.close();
        return Data.getPrograms();
    }
    
    @Override
    public Program getProgramById(String id) {
        return Data.getProgramById(id);
    }

    @Override
    public List<Permanencia> getHistoricalPermanence(String id) {
        Program p=Data.getProgramById(id);
        return p.getPermanencia();
    }

    @Override
    public Permanencia getPermanenceById(String id, int start) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Historico> getHistorical(String id) {
        Program p=Data.getProgramById(id);
        return p.getHistorico();
    }

    @Override
    public float getPercentPermanence(String id) {
        Program p=Data.getProgramById(id);
        return p.getpPermanencia();
    }

    @Override
    public float getPercentAdmitted(String id) {
        Program p=Data.getProgramById(id);
        return p.getpAdmitidos();
    }

    @Override
    public float getPercentEnrolled(String id) {
        Program p=Data.getProgramById(id);
        return p.getpMatriculados();
    }

    

    
    

    
    

    
}

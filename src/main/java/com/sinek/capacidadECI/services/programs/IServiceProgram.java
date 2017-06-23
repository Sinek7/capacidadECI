/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.services.programs;

import com.sinek.capacidadECI.model.programs.Admitido;
import com.sinek.capacidadECI.model.programs.Historico;
import com.sinek.capacidadECI.model.programs.Inscrito;
import com.sinek.capacidadECI.model.programs.Matriculado;
import com.sinek.capacidadECI.model.programs.Permanencia;
import com.sinek.capacidadECI.model.programs.Program;
import java.util.List;

/**
 *
 * @author henry
 */
public interface IServiceProgram {
    
    /*Histórico de cada programa*/
    
    public List<Program> getPrograms();
    
    public Program getProgramById(String id);
    
    public List<Permanencia> getHistoricalPermanence(String id);
    
    public Permanencia getPermanenceById(String id, int start);
    
    public List<Historico> getHistorical(String id);
    
    
    
    /*...*/
    
    public float getPercentPermanence(String id);
    
    public float getPercentAdmitted(String id);
    
    public float getPercentEnrolled(String id);
    
}

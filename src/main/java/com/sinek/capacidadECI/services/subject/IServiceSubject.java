/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.services.subject;

import com.sinek.capacidadECI.model.subject.Materia;
import com.sinek.capacidadECI.model.subject.Maternidad;
import java.util.List;

/**
 *
 * @author henry
 */
public interface IServiceSubject {

    public List<Maternidad> getHistoricalMaternity();
    
    public Maternidad getMaternityById(int start);
    
    public float getPercentDesertion(); //1-maternidad
    
    public float getPercentMaternity(); //Promedio tasa aprobacion
    
}

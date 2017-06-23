/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.services.subject;

import com.sinek.capacidadECI.model.subject.Materia;
import com.sinek.capacidadECI.model.subject.Maternidad;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author henry
 */
@Service
public class serviceSub implements IServiceSubject {
    //@Autowired    
    //StudentRepository student;
    private Materia subject=new Materia();

    @Override
    public List<Maternidad> getHistoricalMaternity() {
        return subject.getMaternidad();
    }

    @Override
    public Maternidad getMaternityById(int start) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPercentDesertion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPercentMaternity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

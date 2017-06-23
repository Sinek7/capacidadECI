/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.controller.subect;

import com.sinek.capacidadECI.model.subject.Maternidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sinek.capacidadECI.services.subject.IServiceSubject;

/**
 *
 * @author henry
 */
@RestController
@RequestMapping("/api/subject")
public class subjectController {
    
    @Autowired
    private IServiceSubject subjects;
    
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public void setProgram(@RequestBody Materia s) {
//        subjects.setSubject(s); 
//    }
//    
//    @RequestMapping(value = "/put/{id}",method = RequestMethod.POST)
//    public void updateProgram(@PathVariable String id,@RequestBody Materia s) {
//        subjects.updateSubject(s);
//    }
    
    @RequestMapping(value="/maternity", method = RequestMethod.GET)    
    public List<Maternidad> getHistoricalMaternity() {        
        return subjects.getHistoricalMaternity();
    }
    
    @RequestMapping(value = "/maternity/{id}", method = RequestMethod.GET)
    public Maternidad getProgramById(@PathVariable int id) {       
        return subjects.getMaternityById(id);        
    }
}

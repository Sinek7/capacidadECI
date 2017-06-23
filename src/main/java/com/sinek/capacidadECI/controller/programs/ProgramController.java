/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.controller.programs;

import com.sinek.capacidadECI.model.programs.Admitido;
import com.sinek.capacidadECI.model.programs.Historico;
import com.sinek.capacidadECI.model.programs.Inscrito;
import com.sinek.capacidadECI.model.programs.Matriculado;
import com.sinek.capacidadECI.model.programs.Permanencia;
import com.sinek.capacidadECI.model.programs.Program;
import com.sinek.capacidadECI.services.programs.IServiceProgram;
import com.sinek.capacidadECI.services.programs.ServiceProgram;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author henry
 */
@RestController
@RequestMapping("/api/program")
public class ProgramController {
    
    //@Autowired
    private IServiceProgram programs=new ServiceProgram();
    
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public void setProgram(@RequestBody Program p) {
//        programs.setProgram(p); 
//    }
    
//    @RequestMapping(value = "/put/{id}",method = RequestMethod.POST)
//    public void updateProgram(@PathVariable String id,@RequestBody Program p) {
//        programs.updateProgram(p);
//    }
    
    @RequestMapping(method = RequestMethod.GET)    
    public List<Program> getPrograms() {        
        return programs.getPrograms();
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)    
    public Program getProgramById(@PathVariable String id) {        
        return programs.getProgramById(id);
    }
    
    @RequestMapping(value = "/{id}/permanence",method = RequestMethod.GET)    
    public List<Permanencia> getHistoricalPermanence(@PathVariable String id) {        
        return programs.getHistoricalPermanence(id);
    }
    
    @RequestMapping(value = "/{idProg}/permanence/{id}", method = RequestMethod.GET)
    public Permanencia getPermanenceById(@PathVariable String idProg, @PathVariable int id) {       
        return programs.getPermanenceById(idProg,id);
    }
    
    @RequestMapping(value = "/{id}/historical",method = RequestMethod.GET)    
    public List<Historico> getHistorical(@PathVariable String id) {        
        return programs.getHistorical(id);
    }
    

    
}

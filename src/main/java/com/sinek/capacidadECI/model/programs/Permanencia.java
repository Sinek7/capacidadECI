/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinek.capacidadECI.model.programs;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author henry
 */
@Embeddable
public class Permanencia implements java.io.Serializable{   
   
    private int start;
    private int end;
    private float permanence;
    
    public Permanencia(){
        super();
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public float getPermanence() {
        return permanence;
    }

    public void setPermanence(float permanence) {
        this.permanence = permanence;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.EMeasure;
import SupportClasses.EMeasureFlavor;
import java.util.HashSet;
import java.util.Set;
import javax.measure.unit.Unit;

/**
 *
 * @author frascog
 */
public class EMeasureController {
    
    private EMeasure entity;

    public EMeasureController(EMeasure entity) {
        this.entity = entity;
    }   
    
    public EMeasure getEntity() {
        return entity;
    }

    public void setEntity(EMeasure entity) {
        this.entity = entity;
    }

    public String getName() {
        return entity.getName();
    }

    public void setName(String name) {
        this.entity.setName(name);
    }

    public String getDescription() {
        return entity.getDescription();
    }

    public void setDescription(String description) {
        this.entity.setDescription(description);
    }

    public double getMinimum() {
        return this.entity.getMinimum();
    }

    public void setMinimum(double minimum) {
        this.entity.setMinimum(minimum);
    }

    public double getNominal() {
        return this.entity.getNominal();
    }

    public void setNominal(double nominal) {
        this.entity.setNominal(nominal);
    }

    public double getMaximun() {
        return entity.getMaximun();
    }

    public void setMaximun(double maximun) {
        this.entity.setMaximun(maximun);
    }

    @SuppressWarnings("rawtypes")
    public Unit getUnit() {
        return entity.getUnit();
    }

    @SuppressWarnings("rawtypes")
    public void setUnit(Unit unit) {
        this.entity.setUnit(unit);
    }

    public EMeasureFlavor getFlavor() {
        return entity.getFlavor();
    }

    public void setFlavor(EMeasureFlavor flavor) {
        this.entity.setFlavor(flavor);
    }
    
    
}
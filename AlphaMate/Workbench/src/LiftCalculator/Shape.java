/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiftCalculator;

/**
 *
 * @author frascog
 */
public enum Shape {
    Sphere,
    Cube,
    Cuboid,
    Cylinder,
    Capsule,
    Spherical_Cap,;
    
    @Override    
    public String toString() {
        return super.toString().replaceAll("_", " ");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia5.Interfaces;

/**
 *
 * @author gamar
 */
public class Cuadrado implements Figura {
    private double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public double area(){
        return lado*lado;
    }
}

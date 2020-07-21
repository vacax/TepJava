/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisb;

import edu.pucmm.tepjava.interfase.paisa.CiudadanoA;
import edu.pucmm.tepjava.interfase.paisa.ICientifico;

/**
 *
 * @author vacax
 */
public class Cientifico extends CiudadanoA implements ICientifico{

    public Cientifico(String nombre) {
        super(nombre);
    }
    
    @Override
    public void pensar() {
        System.out.println(""+nombre+", pensando....");
    }
    @Override
    public void accion() {
        System.out.println(nombre+" Sentado");
    }
}

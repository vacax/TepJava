/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisb;

import edu.pucmm.tepjava.interfase.paisa.CiudadanoA;
import edu.pucmm.tepjava.interfase.paisa.IMilitar;

/**
 *
 * @author vacax
 */
public class Militar extends CiudadanoA implements IMilitar{

    public Militar(String nombre) {
        super(nombre);
    }

    @Override
    public void pelear() {
        System.out.println(""+nombre+", peleando....");
    }
    @Override
    public void accion() {
        System.out.println(nombre+" Trotando");
    }
    
    
}

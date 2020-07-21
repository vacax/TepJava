/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisb;

import edu.pucmm.tepjava.interfase.paisa.CiudadanoA;
import edu.pucmm.tepjava.interfase.paisa.ITrabajador;

/**
 *
 * @author vacax
 */
public class Trabajador extends CiudadanoA implements ITrabajador{

    public Trabajador(String nombre) {
        super(nombre);
    }

    @Override
    public void trabajar() {
        System.out.println(""+nombre+", trabajando....");
    }
    @Override
    public void accion() {
        System.out.println(nombre+" Revisando");
    }
    
}

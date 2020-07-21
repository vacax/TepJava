/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisa;

/**
 *
 * @author vacax
 */
public class CiudadanoA{
    
    protected String nombre;

    public CiudadanoA(String nombre) {
        this.nombre = nombre;
    } 
    public void accion(){
        System.out.println(nombre+" Caminando");
    }
}

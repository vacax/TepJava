/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase;

import edu.pucmm.tepjava.interfase.paisa.CiudadanoA;
import edu.pucmm.tepjava.interfase.paisa.IMilitar;
import edu.pucmm.tepjava.interfase.paisb.Cientifico;
import edu.pucmm.tepjava.interfase.paisb.Militar;
import edu.pucmm.tepjava.interfase.paisb.Trabajador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vacax
 */
public class GuerraMain {

    public static void main(String[] args) {
        
        //Pais B
        List<CiudadanoA> listaPaisB = new ArrayList<>();
        Militar militarB = new Militar("Militar B");
        Cientifico cientificoB = new Cientifico("Cientifico B");
        Trabajador trabajadorB = new Trabajador("Trabajo B");
        listaPaisB.add(militarB);
        listaPaisB.add(cientificoB);
        listaPaisB.add(trabajadorB);
        
        //Pais A
        List<CiudadanoA> listaPaisA = new ArrayList<>();
        CiudadanoA ciudadanoA1=new Militar("Ciudadano 1");
        CiudadanoA ciudadanoA2=new Cientifico("Ciudadano 2");
        CiudadanoA ciudadanoA3=new Trabajador("Ciudadano 3");
        CiudadanoA ciudadanoA4=new CiudadanoA("Ciudadano 4");
        listaPaisA.add(ciudadanoA1);
        listaPaisA.add(ciudadanoA2);
        listaPaisA.add(ciudadanoA3);
        listaPaisA.add(ciudadanoA4);

        //guerra.
        List<Militar> listaMilitarPaisB = new ArrayList<>();
        listaMilitarPaisB.add(militarB); //incluyendo en al colección...
        //listaMilitarPaisB.add(cientificoB);
        
        List<Militar> listaMilitarPaisA = new ArrayList<>();
        for(CiudadanoA ciudadano: listaPaisA){
            if(ciudadano instanceof Militar)
                 listaMilitarPaisA.add((Militar) ciudadano);
        }
        for(CiudadanoA ciudadano: listaPaisA){
            ciudadano.accion();
        }
        peleaMilitares(listaMilitarPaisA, listaMilitarPaisB);
        
    }
    
    /**
     * 
     * @param listaMilitarPaisA
     * @param listaMilitarPaisB 
     */
    public static void peleaMilitares(List<Militar> listaMilitarPaisA,
            List<Militar> listaMilitarPaisB){
        
        System.out.println("Guerra entre País A y País B");
        int militaresA = listaMilitarPaisA.size();
        int militaresB = listaMilitarPaisB.size();
        System.out.println("La cantidad de militares en A: "+militaresA);
        for(IMilitar iMilitar : listaMilitarPaisA){
            iMilitar.pelear();
        }
        
        System.out.println("La cantidad de militares en B: "+militaresB);
        for(Militar militar : listaMilitarPaisB){
            militar.pelear();
        }
        
        if(militaresA > militaresB){
            System.out.println("Gano País A");
        }else if(militaresA == militaresB){
            System.out.println("Empate...");
        } else{
            System.out.println("Gano País B");
        }
    }
}
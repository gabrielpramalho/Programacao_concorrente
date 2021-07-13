/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacaoconcorrente;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        Ponte ponte = new Ponte();
        Carro c = new Carro(ponte);
        Ambulancia a = new Ambulancia(ponte);
        Viatura v = new Viatura(ponte);
        
        c.setPriority(5);
        a.setPriority(10);
        v.setPriority(9);
        
        
        System.out.println(c.getPriority());
        System.out.println(a.getPriority());
        System.out.println(v.getPriority());
        
        
        c.start();
        a.start();
        v.start();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacaoconcorrente;

import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Ponte extends Thread {
    boolean ocupado;

    public Ponte() {
        this.ocupado = false;
    }
    
    public synchronized  void entrar (String item){
        
        try{
            while(this.ocupado){
                System.out.println("Ponte Ocupada!");
                wait();
            }
            
            System.out.println(item+" passando");

            Thread.sleep(1000);
            this.ocupado = true;
            
            passou();
            
            
        }catch( InterruptedException e){}
    }
    
    public synchronized void passou(){
        this.ocupado = false;
    }
    
    
}

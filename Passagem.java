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
public class Passagem extends Thread {
    Ponte ponte;
    
    
    public Passagem(Ponte ponte){
        this.ponte = ponte;
    }
    
    @Override
    public void run(){
        String item;
        while(true){
            try{
                item = ponte.retirar();
                System.out.println("##"+item+" passando");
            } catch(InterruptedException ex){}
        }
    }
}

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
public class Ambulancia extends Thread{
    Ponte ponte;

    public Ambulancia(Ponte ponte) {
        this.ponte = ponte;
    }
    
    @Override
    public void run(){
        
        while(true){
            ponte.entrar("Ambulância");
        }
    }
}

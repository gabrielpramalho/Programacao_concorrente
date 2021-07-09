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
public class Ponte {
    String ponte[];
    Integer frente, fim, tamanhoMax, tamanhoAtual;
    
    
    public Ponte (int tamanhoMax){
        ponte = new String[tamanhoMax];
        this.tamanhoMax = tamanhoMax;
        frente = -1;
        fim = -1;
        this.tamanhoAtual = 0;
    }
    
    public synchronized  void entrar (String item){
        
        try{
            while(Objects.equals(tamanhoAtual, tamanhoMax)){
                System.out.println("Ponte Ocupada!");
                wait();
            }
            
            fim = (fim + 1) % tamanhoMax;
            ponte[fim] = item;
            tamanhoAtual++;
            
            if(frente == -1){
                frente = fim;
            }
            Thread.sleep(1000);
            notifyAll();
        }catch( InterruptedException e){}
    }
    
    public synchronized String retirar() throws InterruptedException{
        String item = "";
        while(tamanhoAtual == 0){
            System.out.println("Ponte Vazia");
            wait();
        }
       
        item = ponte[frente];
        ponte[frente] = null;
        frente = (frente+1) % tamanhoMax;
       
        tamanhoAtual--;
        Thread.sleep(1000);
        notifyAll();
        return item;
    }
    
    
}

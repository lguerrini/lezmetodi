/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_metodi;

/**
 *
 * @author tss
 */
public class AppMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //chiedere un numero e stamparne il quadrato
        
        int valore1 = Utils.askInt("dimmi la quantita'",1,100);
        float valore2 = Utils.askFloat("dimmi il peso cadauno", 0,20);
        //faccio il quadrato
        float ris =valore1*valore2;
        //faccio stampare ilnuovo valore
        System.out.println(ris);
        float sc= Utils.calcolaSconto(99.99f, 12.02f);
        
        
        
    }
    
}

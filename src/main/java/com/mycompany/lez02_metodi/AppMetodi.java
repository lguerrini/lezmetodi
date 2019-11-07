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
        /*
        int valore1 = Utils.askInt("dimmi la quantita'",1,100);
        float valore2 = Utils.askFloat("dimmi il peso cadauno", 0,20);
        //faccio il quadrato
        float ris =valore1*valore2;
        //faccio stampare ilnuovo valore
        System.out.println("peso totale="+ris);
        
        
        float prezzo = Utils.askFloat("dimmi il prezzo in euro (es. 50 o 99.99)", 0,2000);
        float sconto = Utils.askFloat("dimmi lo sconto % (es. 20 o 33.33)", 0,100);
        
        float prezzoscontato= Utils.calcolaSconto(prezzo,sconto);
        String vistx="prezzo =" +prezzo +"\n";
        vistx += "sconto = " +sconto +"\n";
        vistx += "prezzo scontato =" +prezzoscontato +"\n";
        prezzoscontato= Utils.calcolaScorporo(prezzo, sconto);
        String vistx2="prezzointero =" +prezzo +"\n";
        vistx2 += "iva = " +sconto +"\n";
        vistx2 += "prezzo scorporato =" +prezzoscontato +"\n";
        String rx =Utils.aggiungiACapo(vistx,vistx2);
        System.out.println(rx);
*/
        //caricamento voti
      int numvoti=Utils.askInt("quanti alunni",1,30);
        int[] listavoti;
        listavoti = Utils.caricaVoti(numvoti);
        String testoTabellone= Utils.creaTabelloneHTML(listavoti);
        System.out.println(testoTabellone);
        
        
        
        
    }
    
}

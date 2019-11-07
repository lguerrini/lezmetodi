/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_metodi;

import javax.swing.JOptionPane;

/**
 * Metodo per far comparire finestra di input caricamento numeri interi
 *
 * @author tss
 *
 */
public class Utils {

    static int askInt(String testo) {
        //dichiaro la variabile di ritorno e la inizializzo
        //contiene il numero come testo
        String strInt;
        int ris = 0;
        //contiene info su qualita' di strInt
        boolean schifezza = true;
        //elaboro ris
        while (schifezza) {
            //chiedo all'utente una frase che contiene l'intero
            strInt = JOptionPane.showInputDialog(testo);
            //trasformo stringa in intero
            // puo' creare errore allora la circondo con try catch
            try {
                ris = Integer.parseInt(strInt);
                schifezza = false;
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        // ritorno il risultato ris 
        return ris;
    }

    static int askInt(String testo, int min, int max) {
        //dichiaro la variabile di ritorno e la inizializzo
        //contiene il numero come testo
        String strInt;
        int ris = 0;
        //contiene info su qualita' di strInt
        boolean schifezza = true;
        //elaboro ris
        while (schifezza) {
            //chiedo all'utente una frase che contiene l'intero
            strInt = JOptionPane.showInputDialog(testo + " - minimo " + min + " e massimo " + max);
            //trasformo stringa in intero
            // puo' creare errore allora la circondo con try catch
            try {
                ris = Integer.parseInt(strInt);

                if (ris >= min && ris <= max) {
                    schifezza = false;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto");
                }
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        // ritorno il risultato ris 
        return ris;
    }

    static float askFloat(String testo, int min, int max) {
        //dichiaro la variabile di ritorno e la inizializzo
        //contiene il numero come testo
        String strFloat;
        float ris = 0;
        //contiene info su qualita' di strInt
        boolean schifezza = true;
        //elaboro ris
        while (schifezza) {
            //chiedo all'utente una frase che contiene l'intero
            strFloat = JOptionPane.showInputDialog(testo + " - minimo " + min + " e massimo " + max);
            //trasformo stringa in intero
            // puo' creare errore allora la circondo con try catch
            try {
                ris = Float.parseFloat(strFloat);

                if (ris >= min && ris <= max) {
                    schifezza = false;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto");
                }
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        // ritorno il risultato ris 
        return ris;
    }
    
    static float calcolaSconto(float prezzo, float sconto){
        float ris=0;
        //float cento=100;
        ris=prezzo -prezzo*sconto/100;
        //ris=Math.round(ris*100)/cento;
        return ris;
    }
    static float calcolaScorporo(float prezzo, float percentuale){
        float ris=0;
        //float cento=100;
        ris= prezzo /(1+percentuale/100);
        //ris=Math.round(ris*100)/cento;
        return ris;
    }
    static String aggiungiACapo(String testobase,String testoadd){
        String ris="";
        ris=testobase  + "\n" + testoadd;
        return ris; // oppure solo testobase  + "\n" + testoadd;
    }
    
    
    static int[] caricaVoti(int numvoti){
        //dichiaro array per i voti grosso numvoti
        int[] arvoti =new int[numvoti];
        //ciclo tutti gli elementio dell'array caricasndo il voto con askint
        for (int i=0;i<numvoti;i++){
            arvoti[i]=askInt("diimi il voto (0..30)",0,30);
        }
        return arvoti;
        
    }
    
    static String creaTabellone(int[] elencovoti) {
        String ris = "";
        float tot = 0;
        for (int i = 0; i < elencovoti.length; i++) {
            ris += "#" + (i + 1) + " - " + elencovoti[i] + "\n";
            tot = tot + elencovoti[i];
        }
        float media = tot / elencovoti.length;
        ris += "voto medio " + media;
        return ris;
    }
    
    static String creaTabelloneHTML(int[] elencovoti) {
        String ris = "<table>";
        float tot = 0;
        for (int i = 0; i < elencovoti.length; i++) {
            ris += "<tr><td>#" + (i + 1) + "</td><td><b>" + elencovoti[i] + "</b></td></tr>";
            tot = tot + elencovoti[i];
        }
        float media = tot / elencovoti.length;
        ris += "</table><br/><b>voto medio " + media;
        return ris;
    }
    
}

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
        ris=prezzo -prezzo*sconto/100;
        
        return ris;
    }
}

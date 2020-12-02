/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author leand
 */
public class Effets {
    Bandeau monBandeau = new Bandeau();
    Font font = monBandeau.getFont();
    Color back = monBandeau.getBackground();
    Color fore = monBandeau.getForeground();


    public void zoom(String Message){
        monBandeau.setMessage(Message);
        for (int i = 5; i < 60 ; i+=5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
            monBandeau.sleep(100);
        }
    }

    public void changerPolice(){
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(100);
    }

    public void tourner(String Message){
        monBandeau.setMessage(Message);
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(2*Math.PI*i / 100);
            monBandeau.sleep(10);
        }
    }

    public void clignote(int nbrCligno, String Message){
        for(int i =0; i < nbrCligno; i++){
            monBandeau.setMessage(Message);
            monBandeau.sleep(500);
            monBandeau.setMessage("");
            monBandeau.sleep(500);
        }   
    }
}
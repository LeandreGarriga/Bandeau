/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bandeau;


/**
 *
 * @author leand
 */
public class Scenario {
    
    Effets monEffets = new Effets();
    
    public static void main(String[] args) {
	    new Scenario().scenario1("Message", 10);
    }


    public void scenario1(String Message, int nbrCligno){
        monEffets.zoom(Message);
        monEffets.tourner(Message);
        monEffets.clignote(nbrCligno, Message);
        monEffets.monBandeau.close();
    }   
}
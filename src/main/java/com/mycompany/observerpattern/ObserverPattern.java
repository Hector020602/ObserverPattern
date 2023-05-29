/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observerpattern;

/**
 *
 * @author alu10571073
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Source source = new Source(10);
        
        BinaryListener binary = new BinaryListener(source);
        OctalListener octal = new OctalListener(source);
        HexaListener hexa = new HexaListener(source);
        
        source.setState(15);
        source.setState(20);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

/**
 *
 * @author alu10571073
 */
public class HexaListener extends Listener {
    
    private Source source;
    
    public HexaListener(Source source) {
        this.source = source;
        source.addListener(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecimal String: " + 
                Integer.toHexString(source.getState()));
    }
    
}

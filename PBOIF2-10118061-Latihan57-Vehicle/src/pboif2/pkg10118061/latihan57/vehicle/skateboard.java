/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan57.vehicle;

/**
 *
 * @author Iqbal
 */
public class skateboard extends vehicle{
    private double myboardlength;

    public void skateboard() {
        System.out.println("Skateboard");
        System.out.println("Brand : "+getMybrand());
        System.out.println("Model : "+getMymodel());
        System.out.println("Panjangnya Board : "+myboardlength);
    }

    public double getMyboardlength() {
        return myboardlength;
    }

    public void setMyboardlength(double myboardlength) {
        this.myboardlength = myboardlength;
    }
    
    
    
}


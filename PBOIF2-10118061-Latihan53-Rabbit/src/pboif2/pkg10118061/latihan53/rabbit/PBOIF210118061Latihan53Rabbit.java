/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan53.rabbit;

/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Rabbit
 */
public class PBOIF210118061Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int legs = 4;
        // TODO code application logic here
       rabbit hasil = new rabbit("food", false, "color", legs, "nama");
       hasil.getName();
       hasil.isVegetarian();
       hasil.getEats();
       hasil.getNoOflegs();
       hasil.getColor();
    
    }
    
}

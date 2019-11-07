/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan54.koordinat;

/**
 *
 * @author Iqbal
 */
public class warnakoordinat extends Koordinat{
    public  String namawarna;

    public warnakoordinat(String namawarna, int x, int y) {
        super(x, y);
        this.namawarna = namawarna;
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
    
    
    
}



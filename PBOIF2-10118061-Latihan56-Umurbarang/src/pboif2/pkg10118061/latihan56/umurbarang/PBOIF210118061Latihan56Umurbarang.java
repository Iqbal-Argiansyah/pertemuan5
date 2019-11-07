/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan56.umurbarang;

/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Umur Barang
 */
public class PBOIF210118061Latihan56Umurbarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int umur = 234;
        // TODO code application logic here
        barangantik hasil = new barangantik(umur);
        radio hasil1 = new radio(umur);
        hasil1.setName("Radio");
        hasil1.getName();
        hasil.umur =(234);
        hasil.tampilumur();
    }
    
}

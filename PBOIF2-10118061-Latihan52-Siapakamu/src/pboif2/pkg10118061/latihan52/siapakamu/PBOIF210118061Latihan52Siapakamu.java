/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan52.siapakamu;

/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Siapa kamu
 */
public class PBOIF210118061Latihan52Siapakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dosen hsl = new  dosen();
        hsl.setNip("41227829930");
        System.out.println("NIP DOSEN :"+hsl.getNip());
        hsl.siapaKamu();
        hsl.mengajarApa();
        mahasiswa hslmhs = new mahasiswa();
        hslmhs.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+hslmhs.getNim());
        hslmhs.siapaKamu();
        hslmhs.kelasApa();
    }
    
}

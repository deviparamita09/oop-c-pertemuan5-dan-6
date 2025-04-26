/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg5601;

/**
 *
 * @author Devi Paramita
 * Tgl: 26 April 2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.warna = "hijau";
        apel.Setrasa("Manis");
        
        System.out.printf("Warna Apel diset %s\n", apel.warna);
        System.out.printf("Rasa Apel diset %s\n", apel.Getrasa());
        
        
        
        buah anggur = new buah();
        anggur.warna = "hitam";
        anggur.Setrasa("Manis");
        
        System.out.printf("Warna Anggur diset %s\n", anggur.warna);
        System.out.printf("Rasa Apel diset %s\n", anggur.Getrasa());
    }
    
}


class buah {
    public String warna;
    private String rasa;
    
    public void Setrasa(String txRasa) {
        this.rasa = txRasa;
        
    }
    public String Getrasa(){
       return this.rasa;
   }
}
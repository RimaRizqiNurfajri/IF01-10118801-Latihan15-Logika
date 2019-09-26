/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;

/**
 *
 * @author
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      : 10118801
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * Hasil pengoprasian logika matematika
 * 
 */
public class Logika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("!(a && b) = " + !(a && b));
        
    }
    
}

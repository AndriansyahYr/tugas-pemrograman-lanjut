/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_prak;

import java.util.Scanner;

/**
 *
 * @author isma
 */
public class main_mahasiswa {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       Scanner inn = new Scanner (System.in);
        System.out.print("Jumlah Mahasiswa    : ");
        int jumlah_mah = in.nextInt();
        
          for (int i = 0; i<jumlah_mah; i++) {
            Mahasiswa jumlah_mahasiswa  = new Mahasiswa();
            
            System.out.println("");
            System.out.print("");
            String nim = inn.nextLine();
            String nama_mahasiswa = inn.nextLine();
            int jumlah_kata_perhalaman = in.nextInt();
            
            jumlah_mahasiswa.isiAtribut(nim, nama_mahasiswa, jumlah_kata_perhalaman);
            jumlah_mahasiswa.displayPesan();
        
    }
    
}

    
}

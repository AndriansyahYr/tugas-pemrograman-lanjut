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
       
      

            Mahasiswa jumlah_mahasiswa  = new Mahasiswa();
            Scanner in = new Scanner (System.in);
            System.out.println("");
            String nim;
            String nama_mahasiswa;
            System.out.print("101,"+" isma, ");
            
            int jumlah_kata_perhalaman = in.nextInt();
            
            jumlah_mahasiswa.isiAtribut(nim="101", nama_mahasiswa="isma", jumlah_kata_perhalaman);
            jumlah_mahasiswa.displayPesan();
            
            System.out.println("");
            
            System.out.print("102,"+" paijo, ");
          
            jumlah_kata_perhalaman = in.nextInt();
            jumlah_mahasiswa.isiAtribut(nim="102", nama_mahasiswa="paijo", jumlah_kata_perhalaman);
            jumlah_mahasiswa.displayPesan();
            
            System.out.println("");
            
             System.out.print("103,"+" paijul, ");
            jumlah_kata_perhalaman = in.nextInt();
            jumlah_mahasiswa.isiAtribut(nim="103", nama_mahasiswa="paijul", jumlah_kata_perhalaman);
            jumlah_mahasiswa.displayPesan();
            
            System.out.println("");
            
             System.out.print("104,"+" suminem, ");
            jumlah_kata_perhalaman = in.nextInt();
            jumlah_mahasiswa.isiAtribut(nim="104", nama_mahasiswa="suminem", jumlah_kata_perhalaman);
            jumlah_mahasiswa.displayPesan();

            System.out.println("");
            
             System.out.print("105,"+" eminem, ");
            jumlah_kata_perhalaman = in.nextInt();
            jumlah_mahasiswa.isiAtribut(nim="105", nama_mahasiswa="eminem", jumlah_kata_perhalaman);
            jumlah_mahasiswa.displayPesan();
        
    }
    
}

    

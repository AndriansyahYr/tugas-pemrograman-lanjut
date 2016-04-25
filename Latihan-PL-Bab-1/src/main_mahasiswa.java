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
       Scanner in2 = new Scanner (System.in);
       int n = in2.nextInt();

       Mahasiswa1 m[] = new Mahasiswa1[n];
       Buku cerpen = new Buku();
       
       for(int i = 0; i<n ; i++){
       
           m[i] = new Mahasiswa1();
           String nama, nim;
           int kata;
           System.out.println("nama :");
            nama = in.nextLine();
            System.out.println("nim :");
            nim = in.nextLine();
            System.out.println("kata");
            kata = in2.nextInt();
            m[i].setNim(nim);
            m[i].setNama(nama);
            m[i].jumlahKata();
            System.out.println(cerpen.getJumlahHalaman()*kata);
            
       }
   
      
    
}

    
}

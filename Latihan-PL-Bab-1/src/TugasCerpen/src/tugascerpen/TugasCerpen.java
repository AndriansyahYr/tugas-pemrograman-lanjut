/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascerpen;

/**
 *
 * @Nama : Usman Adi Nugroho
 *  NIM  : 155150200111093
 *  Kelas: TIF-H
 */
import java.util.Scanner;
public class TugasCerpen {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        Tugas cerpen[]=new Tugas[5];
        
        String nime,namae;
        int katae;
        
        for (int i = 0; i <= 4 ; i++) {
            cerpen[i]=new Tugas();
            System.out.print("NIM "+(i+1)+" :");
            nime=in.next();
            System.out.print("Nama "+(i+1)+" : ");
            namae=in.next();
            System.out.print("kata/halaman : ");
            katae=in.nextInt();
            if (katae>500||katae<100) {
                System.out.println("jumlah kata per halaman tidak sesuai");
                            }
            cerpen[i].editcerpen(nime, namae, katae);
            cerpen[i].displaycerpen();
        }
    }
    
}

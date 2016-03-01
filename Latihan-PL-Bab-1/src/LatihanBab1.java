package latihan.bab1;

import java.util.Scanner;

public class LatihanBab1 {
    String[] Nama = new String[5], nim =  new String[5];
    int[] Kata = new int [5];
    int[] sum = new int [5];
    
    void getinputData(){
        Scanner in = new Scanner (System.in);
        System.out.println("================================================");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data mahasiswa "+(i+1));
            System.out.print("Nama                      : ");
            Nama[i] = in.next();
            System.out.print("NIM                       : ");
            nim[i] = in.next();
            System.out.print("Jumlah Kata per halaman   : ");
            Kata[i] = in.nextInt();
        System.out.println("================================================");
        } 
    }
    void Tampilkan(){
        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("Tampilan AKhir");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nama                     : "+Nama[i]);
            System.out.println("NIM                      : "+nim[i]);
            System.out.println("Jumlah Kata per halaman  : "+Kata[i]);
            System.out.println("Total kata yang ditulis  : "+sum[i]);
            System.out.println("------------------------------------------------");
        }
    }
}

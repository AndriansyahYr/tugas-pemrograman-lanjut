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
            if (Kata[i]>100 && Kata[i]<500){
                sum[i] = Kata[i]*30;
                System.out.println("Total Kata yang ditulis  : "+sum[i]);
            }
            else if (Kata[i]<100){
                System.out.println("Error, Jumlah Kata anda Kurang dari semestinya");
            }
            else{
                System.out.println("Error, Jumlah Kata anda Melebihi semestinya");
            }
            System.out.println("------------------------------------------------");
        }
    }
}

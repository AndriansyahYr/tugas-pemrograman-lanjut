package latihan.bab1;

import java.util.Scanner;

public class LatihanBab1 {
    int jumlah = 5;
    
    String[] nama_mahasiswa = new String[jumlah], nim =  new String[jumlah];
    int[] jumlah_kata_perhalaman = new int [jumlah];
    int[] sum = new int [jumlah];
    
    void getinputData(){
        Scanner in = new Scanner (System.in);
        System.out.println("================================================");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa "+(i+1));
            System.out.print("Nama                      : ");
            nama_mahasiswa[i] = in.next();
            System.out.print("NIM                       : ");
            nim[i] = in.next();
            System.out.print("Jumlah Kata per halaman   : ");
            jumlah_kata_perhalaman[i] = in.nextInt();
        System.out.println("================================================");
        } 
    }
 
    void Tampilkan(){
        System.out.println("Tampilan Akhir");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama                     : "+nama_mahasiswa[i]);
            System.out.println("NIM                      : "+nim[i]);
            System.out.println("Jumlah Kata per halaman  : "+jumlah_kata_perhalaman[i]);
            if (jumlah_kata_perhalaman[i]>100 && jumlah_kata_perhalaman[i]<500){
                sum[i] = jumlah_kata_perhalaman[i]*30;
                System.out.println("Total Kata yang ditulis  : "+sum[i]);
            }
            else if (jumlah_kata_perhalaman[i]<100){
                System.out.println("Error, Jumlah Kata anda Kurang dari semestinya");
            }
            else{
                System.out.println("Error, Jumlah Kata anda Melebihi semestinya");
            }
            System.out.println("------------------------------------------------");
        }
    }
}

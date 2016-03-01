package t1_mahasiswa;

import java.util.Scanner;

/**
 *
 * @author Karunia
 */
public class mainMahasiswa {
    
    public static void main (String[] args){
        Scanner inputnama = new Scanner (System.in);
        Scanner inputnim = new Scanner (System.in);
        Scanner inputjumkat = new Scanner (System.in);
        
        Mahasiswa mahasiswaN[] = new Mahasiswa[5];
        for (int i=0;i<mahasiswaN.length;i++){
            mahasiswaN[i] = new Mahasiswa();
            System.out.println("=====Silahkan melengkapi data dibawah ini=====");
            System.out.print("Masukkan nama        : ");
            mahasiswaN[i].nama = inputnama.nextLine();
            System.out.print("Masukkan nim         : ");
            mahasiswaN[i].nim = inputnim.nextLine();
            System.out.print("Jumlah kata/halaman  : ");
            mahasiswaN[i].jumlahkata= inputjumkat.nextInt();
            mahasiswaN[i].tampillanMahasiswa();
            System.out.println("==============================================");
    }
}
}
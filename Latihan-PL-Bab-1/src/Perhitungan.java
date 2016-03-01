package tugaspemlan1;

import java.util.Scanner;

public class Perhitungan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int pilihan;
        DataPerhitungan Mahasiswa = new DataPerhitungan();
        boolean tutup =false;
        do{
            System.out.print("Nama Depan: ");
            String nama = in.next();
            System.out.print("NIM       : ");
            String nim = in.next();
            System.out.print("Kata      : ");
            int kata = input.nextInt();
            if (kata>100 && kata<500){
            Mahasiswa.Perhitungan(kata,nama,nim);
            Mahasiswa.Display();
            }
            else 
                System.out.println("Data tidak valid");
            System.out.println("Lanjut?");
            System.out.println("1. ya");
            System.out.println("2. tidak");
            System.out.print("Pilihan   : ");
            pilihan = in.nextInt();
            if (pilihan == 2)
                break;      
        }while(tutup = true);
    }
}

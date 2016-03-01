package tugaspraktekpertama;

import java.util.Scanner;

public class TugasPraktekPertama {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Jumlah Mahasiswa yang di input : ");
        int jumlah = masukan.nextInt();
        Buku buku[] = new Buku[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama \t\t: ");
            String namaMahasiswa = masukan.next();
            System.out.print("Nim \t\t: ");
            long NIM = masukan.nextLong();
            System.out.print("Jumlah Kata \t: ");
            int jumlahKata = masukan.nextInt();
            System.out.println("");
            buku[i] = new Buku(namaMahasiswa, NIM, jumlahKata);
        }
        System.out.println("--------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("");
            System.out.println("Mahasiswa ke " + (i + 1));
            buku[i].displayData();
        }
    }

}

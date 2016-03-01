package Tugas;

import java.util.Scanner;

public class MainKata {
    public static void main(String[] args) {
   
    Kata jumlah_mahasiswa = new Kata();
    Scanner in = new Scanner (System.in);
    
    String nama_mahasiswa;
    String nim;
    int jumlah_kata_perhalaman;
    
    System.out.print("101"+" paijo ");
    jumlah_kata_perhalaman = in.nextInt();
    
    jumlah_mahasiswa.NIM(nim = "101 ");
    jumlah_mahasiswa.Nama(nama_mahasiswa = "paijo");
    jumlah_mahasiswa.jumlahKata(jumlah_kata_perhalaman);
    jumlah_mahasiswa.displayKata();
    
    
    System.out.print("102"+" lulu ");
    jumlah_kata_perhalaman = in.nextInt();
    
    jumlah_mahasiswa.NIM(nim = "102 ");
    jumlah_mahasiswa.Nama(nama_mahasiswa = "lulu");
    jumlah_mahasiswa.jumlahKata(jumlah_kata_perhalaman);
    jumlah_mahasiswa.displayKata();
    
    
    System.out.print("103"+" lala ");
    
    jumlah_kata_perhalaman = in.nextInt();
    
    jumlah_mahasiswa.NIM(nim = "103 ");
    jumlah_mahasiswa.Nama(nama_mahasiswa = "lala");
    jumlah_mahasiswa.jumlahKata(jumlah_kata_perhalaman);
    jumlah_mahasiswa.displayKata();
    
    
    System.out.print("104"+" lili ");
    
    jumlah_kata_perhalaman = in.nextInt();
    
    jumlah_mahasiswa.NIM(nim = "104 ");
    jumlah_mahasiswa.Nama(nama_mahasiswa = "lili");
    jumlah_mahasiswa.jumlahKata(jumlah_kata_perhalaman);
    jumlah_mahasiswa.displayKata();
    
    
    System.out.print("105"+" jojo ");
    
    jumlah_kata_perhalaman = in.nextInt();
    
    jumlah_mahasiswa.NIM(nim = "105 ");
    jumlah_mahasiswa.Nama(nama_mahasiswa = "jojo");
    jumlah_mahasiswa.jumlahKata(jumlah_kata_perhalaman);
    jumlah_mahasiswa.displayKata();
    
    }
}
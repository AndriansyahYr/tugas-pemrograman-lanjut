/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author HP 8.1
 */
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        Scanner out = new Scanner(System.in);
        String nama_mahasiswa;
        int nim, jumlah_kata_perhalaman;
        
        Mahasiswa jumlah_mahasiswa = new Mahasiswa();
        System.out.print("Jumlah Mahasiswa : \n");
        int jum_mhs = my.nextInt();

        for (int i=0; i<jum_mhs; i++) {
            nim = my.nextInt();
            nama_mahasiswa = out.nextLine();
            jumlah_kata_perhalaman = my.nextInt();
            jumlah_mahasiswa.isiData(nim,nama_mahasiswa,jumlah_kata_perhalaman);
            jumlah_mahasiswa.Hitung();
        }
        System.out.println();
        
    }
}

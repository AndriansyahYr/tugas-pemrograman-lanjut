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
        System.out.print("Jumlah Mahasiswa : ");
        int jum_mhs = my.nextInt();
        Mahasiswa jumlah_mahasiswa []= new Mahasiswa[jum_mhs];
        int nim[]=new int[jum_mhs];
        String nama_mahasiswa[]= new String [jum_mhs];
        int jumlah_kata_perhalaman[]=new int [jum_mhs];

        for (int i=0; i<jum_mhs; i++) {
            nim[i] = my.nextInt();
            nama_mahasiswa[i] = out.nextLine();
            jumlah_kata_perhalaman[i] = my.nextInt();
            jumlah_mahasiswa[i]= new Mahasiswa();
            jumlah_mahasiswa[i].isiData(nim[i],nama_mahasiswa[i],jumlah_kata_perhalaman[i]);
        }
        System.out.println();
        for (int i = 0; i <jum_mhs; i++) {
            jumlah_mahasiswa[i].Tampil();
            jumlah_mahasiswa[i].Hitung();
        }
        System.out.println();
    }
}

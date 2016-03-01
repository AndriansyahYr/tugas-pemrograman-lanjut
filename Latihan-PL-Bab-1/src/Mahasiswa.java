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
public class Mahasiswa {
    Scanner in = new Scanner(System.in);
    String nama_mahasiswa;
    int jumlah_kata_perhalaman,nim;

    void isiData( int nim, String nama_mhs, int jumlah_kata){
        this.nim = nim;
        this.nama_mahasiswa = nama_mhs;
        this.jumlah_kata_perhalaman = jumlah_kata;
    }
        
    void Hitung (){
        System.out.print(nim+","+nama_mahasiswa+","+jumlah_kata_perhalaman+"\n");
        if(jumlah_kata_perhalaman > 100 && jumlah_kata_perhalaman < 500){
            System.out.print(nama_mahasiswa+","+30*jumlah_kata_perhalaman);   
        } else
            System.out.print(nama_mahasiswa+","+"TIDAK TERSEDIA");
        System.out.println();
    }
}

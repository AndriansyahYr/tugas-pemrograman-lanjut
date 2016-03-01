/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_prak;

import java.util.Scanner;

/**
 *
 * @author isma
 */
public class Mahasiswa {
    String nim;
    String nama_mahasiswa;
    int jumlah_kata_perhalaman;
    
    void isiAtribut(String nim, String nama_mahasiswa, int jumlah_kata_perhalaman){
        
       
        
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
        this.jumlah_kata_perhalaman = jumlah_kata_perhalaman;
    }
    
    void displayPesan(){
        if (jumlah_kata_perhalaman > 500){
            System.out.println(nim+","+nama_mahasiswa+","+"melebihi batas");
        }
        
        else if (jumlah_kata_perhalaman < 100){
            System.out.println(nim+","+nama_mahasiswa+","+"kata kurang");
        }
        else{
            System.out.println(nim+","+nama_mahasiswa+","+jumlah_kata_perhalaman*30);
        }
            
        
    }
}

    
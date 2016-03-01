/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author IANLORD
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        int halaman;

        dataTugas isian[] = new dataTugas[5];
        for (int i = 0; i < isian.length; i++) {
            isian[i] = new dataTugas();
            System.out.print("Masukan Nama                      : ");
            nama = input.next();
            System.out.print("Masukan NIM                       : ");
            nim = input.next();
            System.out.print("Masukan Jumlah Halaman            : ");
            halaman = input.nextInt();
            isian[i].pengisianData(nama, nim, halaman);
            if (halaman < 100 || halaman > 500) {
                System.out.print("Jumlah halaman tidak sesuai dengan peraturan");
                System.out.println("");
                System.out.println("");
            } else {
                System.out.print("Jumlah kata dalam 1 buku        : " + isian[i].penghitunganHalaman());
                System.out.println("");
                System.out.println("");
            }
        }

    }

}

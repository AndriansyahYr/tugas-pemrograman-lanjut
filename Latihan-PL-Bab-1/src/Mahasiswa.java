package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {

    String nim;
    String nama_mahasiswa;
    int jumlah_kata_perhalaman;

    void InsertDataMahasiswa(String input) {
        String[] arraySplit = input.split(",");
        if (arraySplit.length == 3) {
            this.nim = arraySplit[0];
            this.nama_mahasiswa = arraySplit[1];
            this.jumlah_kata_perhalaman = Integer.parseInt(arraySplit[2]);
        } else {
            System.out.println("Format salah! Data tidak diproses!");
        }
    }

    void DisplayJumlahKata() {
        if (jumlah_kata_perhalaman > 100 && jumlah_kata_perhalaman < 500) {
            System.out.println(nama_mahasiswa + " = " + jumlah_kata_perhalaman * 30 + " kata");
        } else {
            System.out.println(nama_mahasiswa + " = Kondisi tidak memenuhi!");
        }
    }
}

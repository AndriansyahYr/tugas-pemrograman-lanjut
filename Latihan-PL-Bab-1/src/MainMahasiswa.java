package mahasiswa;

import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah_mahasiswa;
        jumlah_mahasiswa = sc.nextInt();
        sc.nextLine();
        Mahasiswa array[] = new Mahasiswa[jumlah_mahasiswa];
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            array[i] = new Mahasiswa();
            String input = sc.nextLine();
            array[i].InsertDataMahasiswa(input);
            array[i].DisplayJumlahKata();
        }
    }
}

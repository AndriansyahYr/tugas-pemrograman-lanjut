package pemlan.tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int Mahasiswa ;
        String Nama ;
        int Nim ;
        int Kata ;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa : ");
        Mahasiswa = input.nextInt();
        mahasiswa a[] = new mahasiswa[Mahasiswa];
        for (int i = 0; i < a.length; i++) {       
        a[i] = new mahasiswa();
        System.out.print("Masukan Nama        : ");
        Nama = input.next();
        System.out.print("Masukan Nim         : ");
        Nim = input.nextInt();
        System.out.print("Masukan Jumlah Kata : ");
        Kata = input.nextInt();
        a[i].inputmahasiswa(Nim, Kata, Nama);


            }
        for (mahasiswa a1 : a) {
            System.out.println(" ");
            a1.displaymahasiswa();
        }
    }
}


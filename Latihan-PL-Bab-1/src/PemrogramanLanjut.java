package pemrogramanlanjut;
import java.util.Scanner;
/*
 * Author : I Ketut Sidharta Yogatama
 * NIM    : 155150200111102
 * Kelas  : IF - H
 */
public class PemrogramanLanjut {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String namaMahasiswa, NIM, jumlahKata;
    
        Tugas1 pingMahasiswa = new Tugas1();
        System.out.print("Masukkan Nama Mahasiswa 1 \t\t : ");
        namaMahasiswa = input.next();
        System.out.print("Masukkan NIM Mahasiswa 1  \t\t : ");
        NIM = input.next();
        System.out.print("Masukkan Jumlah Kata  Mahasiswa 1 \t : ");
        jumlahKata = input.next();
        
        pingMahasiswa.setnamaMahasiswa(namaMahasiswa);
        
        System.out.print("Nama Mahasiswa 1 : "+namaMahasiswa);
        
    }  
    }
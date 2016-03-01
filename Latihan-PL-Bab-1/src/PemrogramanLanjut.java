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
    
    //Objek
    String namaMahasiswa, NIM;
    int jumlahKata;
    
        //Mahasiswa 1
        Tugas1 pingMahasiswa = new Tugas1();
        System.out.print("Masukkan Nama Mahasiswa 1 \t\t\t : ");
        Tugas1 pingNIM = new Tugas1();
        namaMahasiswa = input.next();
        System.out.print("Masukkan NIM Mahasiswa 1  \t\t\t : ");
        NIM = input.next();
        Tugas1 pingJumlahKata = new Tugas1();
        System.out.print("Masukkan Jumlah Kata/Halaman Mahasiswa 1 \t : ");
        jumlahKata = input.nextInt();
        
        pingMahasiswa.setnamaMahasiswa(namaMahasiswa);
        pingNIM.setNIM(NIM);
        pingJumlahKata.setJumlahKata(jumlahKata);
        
        System.out.println("===================================================");
        System.out.println("Nama Mahasiswa 1 \t\t\t : "+namaMahasiswa);
        System.out.println("NIM  Mahasiswa 1 \t\t\t : "+NIM);
        System.out.println("Jumlah Kata/Halaman Mahasiswa 1 \t : "+jumlahKata);        
        System.out.println("Jumlah Kata Mahasiswa 1 \t\t : "+pingJumlahKata.getKata());
        
    }  
    }
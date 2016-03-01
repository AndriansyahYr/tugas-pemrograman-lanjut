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
    String [] namaMahasiswa= new String[5], NIM= new String[5];
    int [] jumlahKata= new int[5];
    //inisialisasi
    Tugas1 pingMahasiswa = new Tugas1();
    Tugas1 pingNIM = new Tugas1();
    Tugas1 pingJumlahKata = new Tugas1();
        //for input
        for (int i = 0; i < 5; i++) {

        System.out.print("Masukkan Nama Mahasiswa "+(i+1)+" \t\t\t : ");        
        namaMahasiswa[i] = input.next();
        System.out.print("Masukkan NIM Mahasiswa  "+(i+1)+" \t\t\t : ");
        NIM [i]= input.next();        
        System.out.print("Masukkan Jumlah Kata/Halaman Mahasiswa "+(i+1)+" \t : ");
        jumlahKata [i] = input.nextInt();
        System.out.println("=================================================");
        
        pingMahasiswa.setnamaMahasiswa(namaMahasiswa[i]);
        pingNIM.setNIM(NIM[i]);
        pingJumlahKata.setJumlahKata(jumlahKata[i]);
        }//end for input
        //for output
        for (int i = 0; i < 5; i++) {                 
        System.out.println("=================================================");
        System.out.println("Nama Mahasiswa "+(i+1)+" \t\t\t : "+namaMahasiswa[i]);
        System.out.println("NIM  Mahasiswa "+(i+1)+" \t\t\t : "+NIM[i]);
        System.out.println("Jumlah Kata/Halaman Mahasiswa "+(i+1)+" \t : "+jumlahKata[i]);   
        System.out.println("Jumlah Kata Mahasiswa "+(i+1)+" \t\t : "+pingJumlahKata.getKata());
        }//end for output
        
    }
}
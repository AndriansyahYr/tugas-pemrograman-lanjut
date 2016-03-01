package mahasiswa;
import java.util.Scanner;
public class Mahasiswa {
    int nim;
    String namaMhs;
    int jmlhKata;
    
    void atribut (String namaMhs, int nim, int jmlhKata){
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.jmlhKata = jmlhKata;
    }
    
    void inputan(){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nim         : ");
        nim = in.nextInt();
        System.out.print("Masukkan Nama        : ");
        namaMhs = in.nextLine();
        System.out.print("Masukkan Jumlah Kata : ");
        jmlhKata = in.nextInt();
    }
    
    
}

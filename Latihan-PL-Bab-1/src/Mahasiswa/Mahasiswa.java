package mahasiswa;
import java.util.Scanner;
public class Mahasiswa {
    int nim;
    String namaMhs;
    int jmlhKata;
    
    public void atribut (String namaMhs, int nim, int jmlhKata){
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.jmlhKata = jmlhKata;
    }
    
    public void inputan(){
        Scanner in = new Scanner(System.in);
        System.out.println("----------------Inputan---------------");
        System.out.print("Masukkan Nama        : ");
        namaMhs = in.nextLine();
        System.out.print("Masukkan Nim         : ");
        nim = in.nextInt();
        System.out.print("Masukkan Jumlah Kata : ");
        jmlhKata = in.nextInt();
    }
    
    public void outputan(){
        System.out.println("----------------Output----------------");
        System.out.println("Nama                   : "+namaMhs);
        System.out.println("Nim                    : "+nim);
        System.out.println("Jumlah kata per halaman: "+jmlhKata);
        if (jmlhKata>100 && jmlhKata<500)
            System.out.println("Total Jumlah Kata      : "+(jmlhKata*30));
        else
            System.out.println("Total Jumlah Kata: Error, Range kata hanya 100-500");
        System.out.println("--------------------------------------");
    }
}
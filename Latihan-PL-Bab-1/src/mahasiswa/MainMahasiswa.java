package mahasiswa;
import java.util.Scanner;
public class MainMahasiswa {
    
    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   Scanner in2 = new Scanner(System.in);
   String nama,nim;
   int jumlah;
        System.out.print("Jumlah Mahasiswa : ");
        Mahasiswa Jumlah [] = new Mahasiswa [in2.nextInt()];
        for (int i = 0; i < Jumlah.length; i++) {
        Jumlah [i] = new Mahasiswa ();
        }
        for (int i = 0; i <Jumlah.length; i++) {
            System.out.println("Mahasiswa"+(i+1));
        System.out.print("Nama Mahasiswa      : ");
        nama = in.next();
        System.out.print("NIM                 : ");
        nim = in.next();
        System.out.print("Jumlah Kata/halaman : ");
        jumlah = in.nextInt();
        Jumlah[i].setMahasiswa(nim, nama, jumlah, jumlah);
        System.out.println("===================");
        
        }
        for (int i = 0; i <Jumlah.length; i++) {
            if (Jumlah[i].getJumlahKata()<100||Jumlah[i].getJumlahKata()>500){
                System.out.println("Mahasiswa "+Jumlah[i].getNama_Mahasiswa()+", NIM "+Jumlah[i].getNIM()+", Jumlah "+Jumlah[i].getJumlahtot());
                System.out.println("Salah");
            }else 
            {System.out.println(Jumlah [i].getJumlahKata()*30);
            System.out.println("Nama Mahasiswa " +Jumlah[i].getNama_Mahasiswa()+", NIM "+Jumlah[i].getNIM()+", Jumlah "+Jumlah[i].getJumlahtot());
            }
        }
            
        }
}
    

    

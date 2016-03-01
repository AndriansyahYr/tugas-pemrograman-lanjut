package mahasiswa;
import java.util.Scanner;
public class bukuMahasiswa {
    public static void main(String[] args) {
      Mahasiswa mhs[] = new Mahasiswa [5];
      
      Scanner in = new Scanner (System.in);
      Scanner in2 = new Scanner (System.in);
      Scanner in3 = new Scanner (System.in);
        System.out.println("");
      for(int i=0; i<mhs.length;i++){
      mhs[i]=new Mahasiswa();
        System.out.print("Masukkan nama mahasiswa : ");
        mhs[i].setNama(in.nextLine());
        System.out.print("Masukkan NIM mahasiswa : ");
        mhs[i].setNIM(in2.nextLine());
        System.out.print("Masukkan jumlah kata per halaman : ");
        mhs[i].setKata(in3.nextInt());
      }
        System.out.println("jumlah mahasiswa : 5");
      for (int i=0; i<mhs.length; i++){
          System.out.println(mhs[i].NIM+", "+mhs[i].Nama+", "+mhs[i].Kata+", "+mhs[i].Jumlahkata);
          mhs[i].display();
      }      
    }
}


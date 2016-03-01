import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Jumlah Mahasiswa : ");
        int jumlah_mahasiswa = masukan.nextInt();
        Mahasiswa Mhs[]=new Mahasiswa[jumlah_mahasiswa];
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            Mhs[i] = new Mahasiswa();
            Mhs[i].isiData();            
        }
        System.out.println("======================");
        for (int j = 0; j < jumlah_mahasiswa; j++) {
            System.out.println("Mahasiswa "+(j+1));
            Mhs[j].output();
        }
    }
}
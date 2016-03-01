package Tugas;

public class Kata {
    
    String nama_mahasiswa;
    String nim;
    int jumlah_kata_perhalaman;
    
    void Nama(String nama_mahasiswa){
        this.nama_mahasiswa = "paijo";
    }
    void NIM(String nim){
        this.nim = nim;
    }
    void jumlahKata (int jumlah_kata_perhalaman){
        this.jumlah_kata_perhalaman = jumlah_kata_perhalaman;
    }
    void displayKata(){
        if (jumlah_kata_perhalaman < 100 || jumlah_kata_perhalaman > 500){
            System.out.println("Jumlah kata tidak memenuhi syarat\n");
        }
        else {
            System.out.println(jumlah_kata_perhalaman * 30);
            System.out.println();
        }
    }
 
}
package mahasiswa;
import java.util.Scanner;
public class mhs {

    String nim, nama_mahasiswa;
    int jumlah_kata_perhalaman;
    
    void isiAtribut(){
        
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nama: ");
        nama_mahasiswa = in.nextLine();
        System.out.print("Masukkan nim: ");
        nim = in.nextLine();
        System.out.print("Jumlah kata perhalaman: ");
        jumlah_kata_perhalaman = in.nextInt();
    }
    
    void keluaran(){
        
        if (jumlah_kata_perhalaman > 500){
            System.out.println(nim+","+nama_mahasiswa+","+"data tidak memenuhi syarat");
        }
        else if (jumlah_kata_perhalaman < 100){
            System.out.println(nim+","+nama_mahasiswa+","+"data tidak memenuhi syarat");
        }
        else{
            System.out.println(nim+","+nama_mahasiswa+","+jumlah_kata_perhalaman*30);
        }
        System.out.println("");
    }
}

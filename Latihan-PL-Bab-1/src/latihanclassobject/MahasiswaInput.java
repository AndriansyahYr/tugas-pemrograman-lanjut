package latihanclassobject;
import java.util.Scanner;
public class MahasiswaInput {
    String nim, nama_mahasiswa;
    int jumlahkata, totalkata;
    public void input_data(){
        Scanner in = new Scanner(System.in);
        System.out.print("NIM = ");
        nim = in.nextLine();
        System.out.print("Nama = ");
        nama_mahasiswa = in.nextLine();
        System.out.print("Jumlah Kata = ");
        jumlahkata = in.nextInt();
    }
    public void output_data(){
        System.out.println("Nama : "+nama_mahasiswa);
        if (jumlahkata > 100 && jumlahkata < 500) {
            totalkata = jumlahkata*30;
            System.out.println("Total Kata = "+totalkata);
        }
        else {
            System.out.println("Total Kata = Diluar jangkauan");;
        }
    }
}

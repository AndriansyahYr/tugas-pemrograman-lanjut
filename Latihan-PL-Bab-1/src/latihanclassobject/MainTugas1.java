package latihanclassobject;
import java.util.Scanner;
public class MainTugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        int jum = in.nextInt();
        int[]A = new int[jum];
        MahasiswaInput data[] = new MahasiswaInput[6];
        for (int i = 0; i < jum; i++) {
            data[i] = new MahasiswaInput();
            System.out.println("Masukkan Data "+"("+(i+1)+")");
            data[i].input_data();  
            System.out.println("Hasil : ");
            data[i].output_data();
        }
    }
}

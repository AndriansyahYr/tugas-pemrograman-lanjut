package tugaspl1;
import java.util.Scanner;

public class TugasPL1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nama = new String[5];
        long[] nim = new long[5]; int[] kataPerhalaman = new int[5]; int[] jumlahKata = new int[5];
        
        for(int i=0; i<5; i++){
            System.out.print("Nama : ");
            nama[i] = in.nextLine();
            System.out.print("NIM : ");
            nim[i] = in.nextLong();
            System.out.print("Kata per Halaman : ");
            kataPerhalaman[i] = in.nextInt();
            in.nextLine();
        }
    }
    
}

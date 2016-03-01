package tugaspl1;
import java.util.Scanner;

public class TugasPL1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah_mahasiswa = 5;
        String[] nama_mahasiswa = new String[jumlah_mahasiswa];
        long[] nim = new long[jumlah_mahasiswa]; int[] jumlah_kata_perhalaman = new int[jumlah_mahasiswa];
        
        for(int i=0; i<nim.length; i++){
            System.out.print("nama : ");
            nama_mahasiswa[i] = in.nextLine();
            System.out.print("nim  : ");
            nim[i] = in.nextLong();
            System.out.print("kata per halaman : ");
            jumlah_kata_perhalaman[i] = in.nextInt();
            in.nextLine();
        }
        System.out.println("\noutput: ");
        System.out.println("jumlah mahasiswa : "+jumlah_mahasiswa);
        System.out.println("nim, nama_mahasiswa, jumlah kata perhalaman");
        Data myData = new Data();
        myData.setData(nama_mahasiswa, nim, jumlah_kata_perhalaman);
        myData.getData();
    }
    
}

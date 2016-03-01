package tugaspl1;
import java.util.Scanner;

public class Data {
    Scanner in = new Scanner(System.in);
    private String[] nama_mahasiswa = new String[5];
    private long[] nim = new long[5];
    private int[] jumlah_kata_perhalaman = new int[5];
    
    public void setData(String[] nama_mahasiswa, long[] nim, int[] jumlah_kata_perhalaman){
        this.nama_mahasiswa = nama_mahasiswa;
        this.nim = nim;
        this.jumlah_kata_perhalaman = jumlah_kata_perhalaman;
    }
    public void getData(){
        for(int i=0; i<5; i++){
            if(jumlah_kata_perhalaman[i]>100&&jumlah_kata_perhalaman[i]<500){
                int jumlahKata = jumlah_kata_perhalaman[i]*30;
                System.out.println(nim[i]+", "+nama_mahasiswa[i]+", "+jumlah_kata_perhalaman[i]+", "+jumlahKata);
            }
            else
                System.out.println(nim[i]+", "+nama_mahasiswa[i]+", "+jumlah_kata_perhalaman[i]+", Gagal");
        }
    }
}

package tugaspl1;
import java.util.Scanner;

public class Data {
    private String[] nama = new String[5];
    private long[] nim = new long[5]; int[] kataPerhalaman = new int[5]; int jumlahKata;
    Scanner in = new Scanner(System.in);
    
    public void setData(String[] nama, long[] nim, int[] kataPerhalaman){
        this.nama = nama;
        this.nim = nim;
        this.kataPerhalaman = kataPerhalaman;
    }
    public void JumlahKata(){
        System.out.println("Nama\t\tNIM\t\tKata per Halaman\t\tJumlah Kata");
        for(int i=0; i<5; i++){
            jumlahKata = this.kataPerhalaman[i]*30;
            System.out.println(nama[i]+"\t\t"+nim[i]+"\t\t"+kataPerhalaman[i]+"\t\t"+jumlahKata);
        }
    }
}

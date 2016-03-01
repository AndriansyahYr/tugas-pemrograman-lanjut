package tugashilmi;

import java.util.Scanner;

public class TugasHilmi {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.print("Berapa Mahasiswa\t: ");
            int i=in.nextInt();
            String[] nim=new String[i];
            String[] nama=new String[i];
            int[] kata=new int[i];
            liatKata liat=new liatKata(i);
            for(int b=0;b<i;b++){
                System.out.print("Masukkan NIM\t: ");
                nim[b]=in.next();
                System.out.print("Masukkan Nama\t: ");
                nama[b]=in.next();
                System.out.print("Masukkan Kata\t: ");
                kata[b]=in.nextInt();
            
                liat.InputData(nim[b], nama[b], kata[b]);
                liat.JumlahKata(b);
                System.out.println("============================================");
            }
        }

}



    class liatKata {
        public String nama;
        public int kata;
        public String nim;
        public int[] JumlahKata;
    
        public liatKata(int panjang){
            this.JumlahKata = new int[panjang];
            
        }
        public void InputData(String nim, String nama, int kata){
            this.nim = nim;
            this.nama = nama;
            this.kata = kata;
        }
    
        public void JumlahKata(int i){
            
            for(int a=i;a<=i;a++){
                if(100<kata && kata<500){
                    JumlahKata[i]=kata*30;
                    System.out.println("Jumlah Kata adalah "+JumlahKata[i]);
                }
                else{
                    System.out.println("Jumlah Kata Tidak Bisa Di Proses");
                }
            }
    }
    
}
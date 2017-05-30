package cerpen;

import java.util.Scanner;

public class mahasiswa1 {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        Scanner input=new Scanner (System.in);
	int jumlah_mahasiswa = in.nextInt();
        mahasiswa [] mhs = new mahasiswa [jumlah_mahasiswa];
        for (int i=0;i<5;i++){
            mhs[i]=new mahasiswa();
            String nim=input.nextLine();
            String nama=input.nextLine();
            int jumlah_kata_perhalaman=in.nextInt();
            mhs [i].jumlah_kata_perhalaman(nim, nama, jumlah_kata_perhalaman);
       	    System.out.println ("");
 }
        System.out.println("");
        for (int i=0;i<jumlah_mahasiswa;i++){
	    System.out.println(mhs[i].nim+", "+mhs[i].nama_mahasiswa+", "+mhs[i],jumlah_kata_perhalaman);
            mhs[i].hitung();
            System.out.println("");
        }
        
    }
    
}

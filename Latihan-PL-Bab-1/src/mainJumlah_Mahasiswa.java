package latihan.pkgclass.object;

import java.util.Scanner;

public class mainJumlah_Mahasiswa {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        jumlah_mahasiswa jumlah_mahasiswa1[] =new jumlah_mahasiswa[5];
        for(int i=0;i<jumlah_mahasiswa1.length;i++){
            jumlah_mahasiswa1 [i] = new jumlah_mahasiswa();
            System.out.print("NIM               : ");
            String nim = in.next();
            System.out.print("Nama Mahasiswa    : ");
            String nama_mahasiswa = in.next();
            System.out.print("Jumlah Kata       : ");
            int jumlah_kata_perhalaman = in.nextInt();
            jumlah_mahasiswa1[i].setisiAtribut(nim, nama_mahasiswa, jumlah_kata_perhalaman);
        }
            for (int i=0;i<jumlah_mahasiswa1.length;i++) {
                if (jumlah_mahasiswa1[i].getjumlah_kata_perhalaman()<100 || jumlah_mahasiswa1[i].getjumlah_kata_perhalaman()>500) {
                    System.out.println(jumlah_mahasiswa1[i].nim+","+jumlah_mahasiswa1[i].nama_mahasiswa+","+"Diluar Batas");
                }
                    else {
                            jumlah_mahasiswa1[i].displayMessage();
                }
    }
    }
}
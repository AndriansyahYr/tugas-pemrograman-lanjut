/* 
Nama  : Firman Budi Safrizal
Nim	  : 155150201111147
Kelas : TIF - H
*/

import java.util.Scanner;
public class CerpenMahasiswa_main{
	public static void main(String args[]){
		CerpenMahasiswa mhs[] = new CerpenMahasiswa[5];
		Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
		long nim_mhs;
		String nama_mhs;
		int jumlah_kata_hal;

		for(int i = 0; i<mhs.length; i++){
            mhs[i] = new CerpenMahasiswa();
            System.out.println("==================Data ke-"+(i+1)+"====================");
            System.out.print("Masukkan Nama Mahasiswa 		: ");
            nama_mhs = input2.nextLine();
            System.out.print("Masukkan NIM Mahasiswa  		: ");
            nim_mhs = input.nextLong();
            System.out.print("Masukkan Jumlah Kata Per Halaman 	: ");
            jumlah_kata_hal = input.nextInt();
            mhs[i].InputData(nama_mhs,nim_mhs,jumlah_kata_hal);
            System.out.println("=================Output ke-"+(i+1)+"===================");
            mhs[i].showData();
		}
	}
}
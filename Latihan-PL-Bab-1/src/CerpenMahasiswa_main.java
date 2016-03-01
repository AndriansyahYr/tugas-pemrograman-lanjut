/* 
Nama  : Firman Budi Safrizal
Nim	  : 155150201111147
Kelas : TIF - H
*/

import java.util.Scanner;
public class CerpenMahasiswa_main{
	public static void main(String args[]){
		CerpenMahasiswa mhs1 = new CerpenMahasiswa();
		Scanner input = new Scanner(System.in);
		long nim_mhs;
		String nama_mhs;
		int jumlah_kata_hal;
		
		System.out.print("Masukkan Nama Anda				: ");
		nama_mhs = input.nextLine();
		System.out.print("Masukkan NIM Anda 				: ");
		nim_mhs = input.nextLong();
		System.out.print("Masukkan Jumlah Kata Per Halaman 	: ");
		jumlah_kata_hal = input.nextInt();
		
		mhs1.InputData(nama_mhs,nim_mhs,jumlah_kata_hal);
		mhs1.showData();
	}
}
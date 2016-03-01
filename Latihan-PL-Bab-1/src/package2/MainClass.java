package package2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int jumlahMahasiswa;
		
		Scanner input = new Scanner(System.in);
		Mahasiswa objek = new Mahasiswa();
		
		jumlahMahasiswa = input.nextInt();
		objek.inputData(jumlahMahasiswa);	
		
	}
}
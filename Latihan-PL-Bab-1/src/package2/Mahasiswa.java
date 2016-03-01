package package2;

import java.util.Scanner;

public class Mahasiswa {

	private int jumlahMahasiswa;
	int nim[];
	int kataPerhalaman[];
	String nama[];
	
	Scanner input = new Scanner(System.in);
	
	public void inputData (int jumlahMahasiswa) {
		this.jumlahMahasiswa = jumlahMahasiswa;
		nim = new int[jumlahMahasiswa];
		nama = new String[jumlahMahasiswa];
		kataPerhalaman = new int[jumlahMahasiswa];
		
		System.out.println("```");
		for (int i = 0; i < jumlahMahasiswa; i++) {
			nim[i] = input.nextInt();
			System.out.print(",");
			nama[i] = input.next();
			System.out.print(",");
			kataPerhalaman[i] = input.nextInt();
		}
		System.out.println("```");
	}
	
	public void displayData () {
	
	}
}
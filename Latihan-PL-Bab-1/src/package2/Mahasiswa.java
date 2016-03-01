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
	}
	
	public void displayData () {
	
	}
}
package package2;

import java.util.Scanner;

public class Mahasiswa {

	private int jumlahMahasiswa;
	int nim[];
	int kataPerhalaman[];
	int totalKata[];
	String nama[];
	
	Scanner input = new Scanner(System.in);
	
	public void inputData (int jumlahMahasiswa) {
		this.jumlahMahasiswa = jumlahMahasiswa;
		nim = new int[jumlahMahasiswa];
		nama = new String[jumlahMahasiswa];
		kataPerhalaman = new int[jumlahMahasiswa];
		totalKata = new int[jumlahMahasiswa];
		
		System.out.println("```");
		for (int i = 0; i < jumlahMahasiswa; i++) {
			nim[i] = input.nextInt();
			System.out.print(", ");
			nama[i] = input.next();
			System.out.print(", ");
			kataPerhalaman[i] = input.nextInt();
			totalKata[i] = kataPerhalaman[i] * 30;
		}
		System.out.println("```");
	}
	
	public void displayData () {
		System.out.println("```");
		for (int i = 0; i < jumlahMahasiswa; i++) {
			System.out.print(nama[i]);
			System.out.print(", ");
			if (kataPerhalaman[i] < 100) {
				System.out.println("Gagal");
			} else if (kataPerhalaman[i] > 500) {
				System.out.println("Gagal");
			} else {
			System.out.println(totalKata[i]);
			}
		}
		System.out.println("```");
	}
}
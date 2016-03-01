package package1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SubClass namaMahasiswa[] = new SubClass[5];
		
		for (int i = 0; i < namaMahasiswa.length; i++) {
			namaMahasiswa[i] = new SubClass();
			System.out.println("Masukkan nama mahasiswa ke"+ (i + 1));
			namaMahasiswa[i].inputData(input.next());
		}
		
		for (int i = 0; i < namaMahasiswa.length; i++) {
			System.out.println("Data mahasiswa ke"+ (i + 1));
			namaMahasiswa[i].displayData();
		}
	}
}
package package1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SubClass namaMahasiswa[] = new SubClass[5];
		SubClass nim[] = new SubClass[5];
		SubClass kataPerhalaman[] = new SubClass[5];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Masukkan data mahasiswa ke "+ (i + 1));
			
			//input nama mahasiswa
			namaMahasiswa[i] = new SubClass();
			System.out.print("Masukkan nama\t: ");
			namaMahasiswa[i].inputNama(input.next());
			
			//input nim
			nim[i] = new SubClass();
			System.out.print("Masukkan nim\t: ");
			nim[i].inputNim(input.next());
			
			//input kata per halaman
			kataPerhalaman[i] = new SubClass();
			System.out.print("Masukkan kata per halaman: ");
			kataPerhalaman[i].inputKataPerhalaman(input.nextInt());
			
			System.out.println();
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Data mahasiswa ke "+ (i + 1));
			namaMahasiswa[i].displayData();
			System.out.println();
		}
	}
}
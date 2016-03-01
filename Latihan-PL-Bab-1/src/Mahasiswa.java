import java.util.Scanner;
public class Mahasiswa{
	String nim;
	String namaMahasiswa;
	int jmlKata;

	void isiData(){
		Scanner masukan = new Scanner (System.in);
		System.out.print("Nama Mahasiswa : ");
		namaMahasiswa=masukan.nextLine();
                System.out.print("Nim :");
		nim=masukan.nextLine();
                System.out.print("Jumlah Kata : ");
		jmlKata=masukan.nextInt();
                }
        void output(){
            System.out.println("Nama :"+namaMahasiswa);
            System.out.println("Nim : "+nim);
            System.out.println("JUmlah Kata : "+jmlKata);
        }
}
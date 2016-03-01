import java.util.Scanner;
public class Mahasiswa{
	String nim;
	String nama_mahasiswa;
	int jumlah_kata_perhalaman, jmlKata;
        
	void isiData(){
		Scanner masukan = new Scanner (System.in);
		System.out.print("Nama : ");
		nama_mahasiswa=masukan.nextLine();
                System.out.print("Nim :");
		nim=masukan.nextLine();
                System.out.print("Jumlah Kata : ");
		jumlah_kata_perhalaman=masukan.nextInt();
                }        
        void output(){
            System.out.println("Nama :"+nama_mahasiswa);
            System.out.println("Nim : "+nim);
            System.out.println("Jumlah Kata Per Halaman : "+jumlah_kata_perhalaman);
            if (jumlah_kata_perhalaman>100 && jumlah_kata_perhalaman<500){
                jmlKata=jmlKata*30;
            System.out.println("Jumlah Kata :"+jmlKata);
            } else {System.out.println("Jumlah Kata : tidak memenuhi syarat");}

        }
}
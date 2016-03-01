import java.util.Scanner;
public class Mahasiswa{
	String nim;
	String namaMahasiswa;
	int jmlKata, jmlKata2;

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
        if (jmlKata>100 && jmlKata<500){
                jmlKata2=jmlKata*30;
            System.out.println("Jumlah Kata :"+jmlKata2);
    	} else {System.out.println("Jumlah Kata : tidak memenuhi syarat");}
    				}
	}
}
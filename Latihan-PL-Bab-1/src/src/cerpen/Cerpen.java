
package cerpen;

import java.util.Scanner;
public class Cerpen {//class

    public static void main(String[] args) {//main method
        Scanner input = new Scanner(System.in);//object
        Cerpen1 siswa[]= new Cerpen1[5];//object
        String nama,nim;//attribut
        int hal;//attribut
        for (int i = 0; i < siswa.length ; i++) {
             siswa[i] = new Cerpen1();
             System.out.print("Masukkan NIM                     : ");
             nim = input.next();
             System.out.print("Masukkan nama                    : ");
             nama = input.next();
             System.out.print("Masukkan banyak kata per-halaman : ");
             hal = input.nextInt();
             siswa[i].data(nim, nama, hal);
             if (hal<100||hal>500) {
                 System.out.println("Jumlah kata per halaman tidak memenuhi syarat");
                
            }
             else {System.out.println("Jumlah kata yang dituliskan : "+siswa[i].jumlahHalaman());
             }
        }
    }
    
}

Letakkan source code anda disini
package praktikum1;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        Cerpen baru = new Cerpen();
        Cerpen book[] = new Cerpen[100];
        buku (input,in,book,baru);
        luar (book,baru);
    }
        public static void buku (Scanner input,Scanner in,Cerpen book [],Cerpen baru){
         int a,b;
            System.out.println("Jumlah Mahasiswa        : ");
            baru.mhs(input.nextInt());
            b = baru.mhs1();
        for( a=0;a<b;a++){
            book[a]  = new Cerpen();
            System.out.println("nim, nama_mahasiswa, jumlah_kata_perhalaman");
            System.out.print("");
            book[a].nim(input.nextLong());
            System.out.print("");
            System.out.print("");
            book[a].nama(in.nextLine());
            System.out.print("");
            book[a].kata(input.nextInt());
            
              }
            
        }
        public static void luar (Cerpen book[],Cerpen baru){
            int b = baru.mhs1();
            for(int a=0;a<b;a++){
            System.out.println("Nama : "+book[a].nama);
            if (book[a].kata<100){
                System.out.println("Jumlah Kata : Kurang");
            }else if(book[a].kata>500){
                System.out.println("Jumlah Kata : Terlalu Banyak");
            }else {
                int c = book[a].kata*30;
                System.out.println("Jumlah Kata : "+c);
            }
            }
        }
    
    
}
package praktikum1;
import java.util.Scanner;
public class Cerpen {
    String nama;
    int kata,mhs;
    long nim;
    Scanner input = new Scanner (System.in);
public  void nama (String nama){
    this.nama = nama;
    }
public void nim (long nim){
    this.nim = nim;
}
public void kata(int kata){
   this.kata = kata; 
}
public void mhs (int mhs){
    this.mhs = mhs;
}


public int mhs1(){
    return mhs;
}
}

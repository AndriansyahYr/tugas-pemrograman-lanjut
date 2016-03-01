package tugas1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {

        mahasiswa list =new mahasiswa ();
        Scanner in=new Scanner (System.in);
        System.out.print("Jumlah Mahasiswa = ");
        list.jmMahasiswa=in.nextInt();
        
        list.Nim=new String [list.jmMahasiswa];
        list.nama=new String [list.jmMahasiswa];
        list.kata=new int [list.jmMahasiswa];
        
        for (int i = 0; i < list.jmMahasiswa; i++) {
           
            list.Nim[i]=in.next();
            list.nama[i]=in.next();
            list.kata[i]=in.nextInt();       
        }
        System.out.println("");
        
        list.tampilID(); 
    }
    
}

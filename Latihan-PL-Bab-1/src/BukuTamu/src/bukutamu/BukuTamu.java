package bukutamu;
import java.util.Scanner;
public class BukuTamu {
    public static void main(String[] args) {
        String sInp;
        String sTemp[];
        int iMahasiswa;
        
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        
        iMahasiswa = input.nextInt();
        Tamu[] tamu = new Tamu[iMahasiswa];
        for (int i = 0; i < iMahasiswa; i++) {
            sInp = inputStr.nextLine();
            sTemp = sInp.split(",");
            tamu[i] = new Tamu(sTemp[0], sTemp[1], Integer.parseInt(sTemp[2]));
        }
        
        System.out.println("================================================");
        
        for (int i = 0; i < iMahasiswa; i++) {
            System.out.printf("Nama: %s \nNim: %s \nJumlah Halaman: %s\n\n", tamu[i].getNama(), tamu[i].getNim(), tamu[i].getJumlahHalaman());
        }
        
        
        System.out.println("================================================");
    }
    
}

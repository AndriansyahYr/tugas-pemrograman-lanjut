import java.util.Scanner;
public class mainBuku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        int jml, i;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = in.nextInt();
        buku bukua[] = new buku[jml];
        for (i = 0; i < bukua.length; i++) {
            bukua[i] = new buku();
            System.out.println("===============================");
            System.out.print("Masukkan NIM          : ");
            String nim = in1.nextLine();
            System.out.print("Masukkan nama         : ");
            String nama = in1.nextLine();
            System.out.print("Masukkan jumlah kata  : ");
            int kata = in.nextInt();
            bukua[i].inputBuku(nim, kata, nama);
        }
        for (i = 0; i < bukua.length; i++) {
            System.out.println("===============================");
            bukua[i].displayBuku();
        }
    }
}
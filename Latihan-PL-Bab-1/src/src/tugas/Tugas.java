package tugas;
import java.util.Scanner;
public class Tugas { //Class

    public static void main(String[] args) { //Method
        Scanner input = new Scanner (System.in); //Object
        Scanner inputInt = new Scanner (System.in);  //Object
        SetGet mahasiswa[] = new SetGet[5]; 
        System.out.println("Nama  : Jimmy Sohaga Dachi");
        System.out.println("Kelas : TIF-H");
        System.out.println("NIM   : 155150200111099");
        System.out.println("==========================================\n");
        for (int i=0; i<mahasiswa.length;i++)
        {
            mahasiswa[i]=new SetGet(); //Object
            System.out.print("Masukkan nama mahasiswa ke-"+(i+1)+"           : ");
            mahasiswa[i].setNama(input.nextLine());
            System.out.print("Masukkan NIM mahasiswa ke-"+(i+1)+"            : ");
            mahasiswa[i].setNIM(input.nextLine());
            System.out.print("Masukkan jumlah kata perhalaman        : ");
            mahasiswa[i].setJumlahKata(inputInt.nextInt());
            System.out.println("==========================================");
            }
        for (int i=0; i<mahasiswa.length;i++){
            System.out.println("Jumlah seluruh kata pada mahasiswa ke-"+(i+1)+" = "+mahasiswa[i].getHasil());
            }   
    }  
}

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        System.out.println("Jumlah Mahasiswa :");
        int a= input.nextInt ();
        
        SideClass[] loop= new SideClass[a];
        
        for (int i = 0; i < a; i++) {
            loop [i]=new SideClass();
            
            System.out.println("Nama :");
            loop[i].Nama=input.next();
            
            System.out.println("NIM :");
            loop [i].NIM=input.nextLong();
           
            System.out.println("Jumlah kata tiap halaman :");
            loop[i].KaHal=input.nextInt();
      
        }
        System.out.println("");
        System.out.println("Jumlah mahasiswa : "+a);
        for(int i = 0;i<a;i++){
            System.out.print(loop[i].NIM+", "+loop[i].Nama+", ");
            if(!(loop[i].KaHal>500) && !(loop[i].KaHal<100)){System.out.print(loop[i].KaHal);}else{System.out.print(loop[i].KaHal);}
            System.out.print(", ");
            if(!(loop[i].KaHal>500) && !(loop[i].KaHal<100)){System.out.println(loop[i].KaHal*30);}else{System.out.print("Jumlah kata tidak valid!!");}
            
        }
    }
}

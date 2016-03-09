/*
Nama        : Hafid Satrio Priambodo
NIM         : 155150207111059
Kelas       : IF - H
*/

import java.util.Scanner;

public class mainCO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        latCO co[] = new latCO[5];
        
        for (int i = 0; i < co.length; i++) {
            co[i] = new latCO();
            co[i].nim = in.next();
            co[i].nama = in.next();
            co[i].jmlKata = in.nextInt();
                        
        }
        System.out.println("");
        for (int i = 0; i < co.length; i++) {
            co[i].ruleNdisplay();
        }
    }
}
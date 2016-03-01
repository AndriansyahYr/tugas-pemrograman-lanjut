/*
Nama        : Hafid Satrio Priambodo
NIM         : 155150207111059
Kelas       : IF - H
*/

public class latCO {
    String nim, nama;
    int jmlKata, total;
    int buku = 30;
    
    void ruleNdisplay(){
        if (jmlKata<100) {
            System.out.println("Jumlah kata kurang");
        } else if (jmlKata>500){
            System.out.println("Jumlah kata berlebih");
        } else {
            total = jmlKata * buku;
            System.out.println(nama+" "+total);
        }    
    }
        
}

package tugascerpen;

public class Tugas {
    String nim,nama;
    int kata;  
    
    void editcerpen(String nim,String nama,int kata){
    this.nim=nim;
    this.nama=nama;
    this.kata=kata;
    }
    
    void displaycerpen(){
        
        System.out.println("Jumlah kata di buku : "+kata*30);
    }
}


package tugascerpen;
//class
public class Tugas {
    String nim,nama;//atribut
    int kata;  //atribut
    
    void editcerpen(String nim,String nama,int kata){//method
    this.nim=nim;
    this.nama=nama;
    this.kata=kata;
    }
    
    void displaycerpen(){//method
        
        System.out.println("Jumlah kata di buku : "+kata*30);
    }
}

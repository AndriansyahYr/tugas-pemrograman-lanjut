package cerpen;

public class mahasiswa {
    String nim, nama_mahasiswa;
    int jumlah_kata_perhalaman, hitung;
    
    void jumlah_kata_perhalaman(String nim, String nama_mahasiswa, int jumlah_kata_perhalaman){
        this.nim=nim;
        this.nama_mahasiswa=nama_mahasiswa;
        this.jumlah_kata_perhalaman=jumlah_kata_perhalaman;
        
        
    }
    void hitung (){
        if (jumlah_kata_perhalaman>100 && jumlah_kata_perhalaman<500){
            System.out.println(nama_mahasiswa+", "+30*jumlah_kata_perhalaman);
            
        }else
            System.out.println(nama_mahasiswa+", "+"TIDAK MEMENUHI");
    }
}

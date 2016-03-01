package t1_mahasiswa;

/**
 *
 * @author Karunia
*/
public class Mahasiswa {
    String nim;
    String nama;
    int jumlahkata;
    int jumlahsemua;
    
    void masukMahasiswa (String nim, String nama, int jumlahkata){
        this.nim = nim;
        this.nama = nama;
        this.jumlahkata = jumlahkata;
        this.jumlahsemua = jumlahsemua;
    }
    void tampillanMahasiswa (){
        
        if (jumlahkata < 100){
            System.out.println("Jumlah Kata Kurang Dari 100");
        }
        else if (jumlahkata > 500){
            System.out.println("Jumlah Kata Lebih Dari 500");
        }
        else {
            jumlahsemua = 30 * jumlahkata;
            System.out.println("Jumlah Seluruh Kata pada 30 halaman    : "+jumlahsemua);
        }
        }
    }

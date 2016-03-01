package pemlan.tugas;
 
public class mahasiswa {
    String Nama ;
    int Nim, jumlah ;
    public void inputmahasiswa(int Nim, int jumlah, String Nama){
        this.Nim = Nim ;
        this.Nama = Nama ;
        this.jumlah = jumlah ;
    }
    public void displaymahasiswa(){
        System.out.println("Nim             : "+Nim);
        System.out.println("Nama            : "+Nama);
        if (jumlah < 100 || jumlah > 500) {
        System.out.println("Jumlah Kata     : tidak sesuai ketentuan");
        }else {
        System.out.println("Jumlah Kata     : "+jumlah * 30);
        }
    }
    }
    


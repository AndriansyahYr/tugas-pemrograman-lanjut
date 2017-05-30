package tugaspemlan1;
public class DataPerhitungan {
    int hlm = 30;
    int jmlh,kata;
    String nama,nim;
    
    public void Perhitungan(int kata,String nama,String nim){
        this.jmlh = kata*hlm;
        this.kata = kata;
        this.nama = nama;
        this.nim = nim;
    }
    public void Display(){
        System.out.println("");
        System.out.println("Nama        : "+nama);
        System.out.println("NIM         : "+nim);
        System.out.println("Kata        : "+kata);
        System.out.println("Jumlah      : "+jmlh);
        System.out.println("");
    }
}

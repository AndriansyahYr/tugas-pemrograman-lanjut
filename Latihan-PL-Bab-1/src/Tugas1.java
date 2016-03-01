package pemrogramanlanjut;
/*
 * Author : I Ketut Sidharta Yogatama
 * NIM    : 155150200111102
 * Kelas  : IF - H
 */
public class Tugas1 {
    private int jumlahKata,hasil;
    private String namaMahasiswa, NIM;
    
    public void setnamaMahasiswa (String M){
        namaMahasiswa = M;
    }
    public void setNIM (String N){
        NIM = N;
    }
    public void setJumlahKata (int K){
        jumlahKata = K;
    }
    public int getKata (){
        int hasil = jumlahKata*300;
        return hasil;
    } 
}
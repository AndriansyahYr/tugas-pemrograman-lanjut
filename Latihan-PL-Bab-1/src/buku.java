public class buku {
    int nim, kata;
    String nama;
    void inputBuku(int nim, int kata, String nama) {
        this.nim = nim;
        this.kata = kata;
        this.nama = nama;
    }
    void displayBuku() {
        System.out.println("NIM 	: " + nim);
        System.out.println("Nama  	: " + nama);
        System.out.println("Jumlah Kata	: " + kata*30);
    }
}
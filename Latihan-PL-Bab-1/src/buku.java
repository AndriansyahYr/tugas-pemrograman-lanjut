public class buku {
    int kata;
    String nim, nama;
    void inputBuku(String nim, int kata, String nama) {
        this.nim = nim;
        this.kata = kata;
        this.nama = nama;
    }
    void displayBuku() {
        System.out.println("NIM 	: " + nim);
        System.out.println("Nama  	: " + nama);
        if (kata < 100 || kata > 500) {
            System.out.println("Jumlah Kata	: Di luar ketentuan");
        } else {
            System.out.println("Jumlah Kata	: " + kata * 30);
        }
    }
}

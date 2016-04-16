package tugaspraktekpertama;

public class Buku {

    long NIM;
    String namaMahasiswa;
    int jumlahKata, totalKata;

    Buku(String namaMahasiswa, long NIM, int jumlahKata) {
        this.NIM = NIM;
        this.namaMahasiswa = namaMahasiswa;
        this.jumlahKata = jumlahKata;
    }

    void displayData() {
        System.out.println("");
        System.out.println("Nama\t\t\t: " + namaMahasiswa);
        System.out.println("NIM \t\t\t: " + NIM);
        System.out.println("Jumlah Kata\t\t: " + jumlahKata);
        if (!(jumlahKata < 100) && !(jumlahKata > 500)) {
            totalKata = jumlahKata * 30;
            System.out.println("Jumlah Kata\t\t: " + totalKata);
        } else {
            System.out.println("Jumlah Kata\t\t: Tidak Valid!!!");
        }

    }
}

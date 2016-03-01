package tugas1;

public class mahasiswa {

    int [] kata;
    int halaman = 30;
    String[] Nim;
    String[] nama;
    int jmMahasiswa;

    public void tampilID() {
        for (int i = 0; i < jmMahasiswa; i++) {
            System.out.print(this.nama[i] + ",");
            
            if (this.kata [i] > 100 && this.kata[i] < 500) {
                System.out.println(this.kata[i] * this.halaman);
            } else {
                System.out.println("Tidak Boleh");
            }

        }
    }
}

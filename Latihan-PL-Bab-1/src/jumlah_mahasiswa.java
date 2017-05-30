package latihan.pkgclass.object;
public class jumlah_mahasiswa {
    String nim, nama_mahasiswa;
    int jumlah_kata_perhalaman;
            void setisiAtribut (String nim, String nama_mahasiswa, int jumlah_kata_perhalaman){
            this.nim = nim;
            this.nama_mahasiswa = nama_mahasiswa;
            this.jumlah_kata_perhalaman = jumlah_kata_perhalaman;
            }
            public int getjumlah_kata_perhalaman(){
                return this.jumlah_kata_perhalaman*30;
            }
            void displayMessage(){
                System.out.println(nim+","+nama_mahasiswa+","+jumlah_kata_perhalaman*30);
            }
}    
package mahasiswa;

public class Mahasiswa {
private String NIM;
private String Nama_Mahasiswa;
private int Jumlah_mahasiswa;
private int Jumlah_kata_perhalaman;

void setMahasiswa(String NIM,String Nama_Mahasiswa, int jumlah_mahasiswa, int jumlah_kata_perhalaman){
this.NIM = NIM;
this.Nama_Mahasiswa = Nama_Mahasiswa;
this.Jumlah_kata_perhalaman = jumlah_kata_perhalaman;
this.Jumlah_mahasiswa = jumlah_mahasiswa;
}
void setjumlah_kata_perhalaman(int jumlah_kata_perhalaman){
    this.Jumlah_mahasiswa=jumlah_kata_perhalaman;
}
int getJumlahtot(){
    return this.Jumlah_kata_perhalaman*30;
}
int getJumlahKata(){
    return Jumlah_kata_perhalaman;
}
String getNama_Mahasiswa(){
    return this.Nama_Mahasiswa;
}
String getNIM(){
    return this.NIM;
}
}


    


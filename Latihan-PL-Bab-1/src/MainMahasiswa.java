public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa Mhs[]=new Mahasiswa[5];
        for (int i = 0; i < 2; i++) {
            Mhs[i] = new Mahasiswa();
            Mhs[i].isiData();            
        }
    }
}
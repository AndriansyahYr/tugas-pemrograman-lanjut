package mahasiswa;

public class Mahasiswa {

    public static void main(String[] args) {
        mhs Mahasiswa[] = new mhs[5];
        
        for (int a=0; a<5; a++){
            Mahasiswa[a] = new mhs();
            Mahasiswa[a].isiAtribut();
            System.out.println("--------------------");
            Mahasiswa[a].keluaran();
        }
    }
}
public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa Mhs[]=new Mahasiswa[5];
        for (int i = 0; i < 5; i++) {
            Mhs[i] = new Mahasiswa();
            Mhs[i].isiData();            
        }
        System.out.println("======================");
        for (int j = 0; j < 5; j++) {
            System.out.println("Mahasiswa "+(j+1));
            Mhs[j].output();
        }
    }
}
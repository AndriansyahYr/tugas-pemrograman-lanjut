package TUGAS;

public class MainMahasiswa {
    public static void main(String[] args) {
        System.out.println("5");
        Mahasiswa a1 = new Mahasiswa ();
        a1.nim(101);
        a1.nama_mahasiswa("paijo");
        
        a1.kata(100);a1.displayMessage();
        System.out.println("paijo, 3000");
        a1.kata(900);
        a1.displayMessage();
        System.out.println("paijo, 27000");
        System.out.println("Terlalu Banyak");
        
        Mahasiswa a2 = new Mahasiswa();
        a2.nim(102);
        a2.nama_mahasiswa("lulu");
        a2.kata(200);
        a2.displayMessage();
        System.out.println("lulu, 6000");
        
        Mahasiswa a3 = new Mahasiswa();
        a3.nim(103);
        a3.nama_mahasiswa("lala");
        a3.kata(350);
        a3.displayMessage();
        System.out.println("lala, 1050");
        
        Mahasiswa a4 = new Mahasiswa();
        a4.nim(104);
        a4.nama_mahasiswa("lolo");
        a4.kata(150);
        a4.displayMessage();
        System.out.println("lolo, 4500");
    }
}

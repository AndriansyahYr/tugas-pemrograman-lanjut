public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa m[] = new Mahasiswa[5];
        for (int i=0; i<5; i++) {
        m[i] = new Mahasiswa();
            for (int j=0; j<5; j++) {
                System.out.println("Data Mahasiswa ke-"+(j+1));   
            m[i].inputan();
            System.out.println();
            m[i].outputan();
            System.out.println();
        }       
        }        
        }
    }

    


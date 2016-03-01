package tugas;

public class SetGet { //Class
    String Nama, NIM; //Attribut
    int jumlahKata;   //Attribut
        public void setNama(String nama) //Method
        {   
            Nama=nama;
        }
        public void setNIM(String nim) //Method
        {   
            NIM=nim;
        }
        public void setJumlahKata (int jumlahkata) //Method
        {   
            jumlahKata=jumlahkata;
        }
        public int getHasil () //Method
        {   
            return jumlahKata*30;
        }
    
}

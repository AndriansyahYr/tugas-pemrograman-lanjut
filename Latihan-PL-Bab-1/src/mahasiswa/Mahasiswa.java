package mahasiswa;

public class Mahasiswa {
    String Nama, NIM;
    int Kata, Jumlahkata;

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public void setKata(int kata) {
        Kata = kata;
    }
    public int getKata (){
        return Kata;
    }
    public void setJumlahkata (int kata){
        Jumlahkata = Kata*30;
    }
    public int getJumlahkata (){
        return Jumlahkata;
    }
    
    void display(){
       if (Kata>500){
                
                System.out.println("kata melebihi batas");
        }
       else if(Kata<100){
           System.out.println("kata kurang ");
       }
       else{
        System.out.println("Jumlah kata  :"+Kata*30);
    }}}
         


package TUGAS;
public class Mahasiswa {
    private int nim;
    private String nama_mahasiswa;
    private int kata, hasil;
    
    public void nim(int a){
        nim = a;
    }
    public void nama_mahasiswa(String b){
        nama_mahasiswa = b;
    }
    public void kata (int d){
        kata = d;
        //kata1 = 100*30;
        //kata2 = 900*30;
        //kata3 = 200*30;
        //kata4 = 350*30;
        //kata5 = 150*30;
        
    }
//    public void sethasil (int e){
//        hasil = e*30;
//        if((e>100)||(e<500)){
//        }
//        else 
//            System.out.println("Terlalu banyak");
//    }
    public void displayMessage(){
        System.out.println(nim+","+nama_mahasiswa+","+kata);
    }
}



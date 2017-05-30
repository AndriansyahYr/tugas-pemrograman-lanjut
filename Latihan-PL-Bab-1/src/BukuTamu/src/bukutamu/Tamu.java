package bukutamu;
public class Tamu {
    private String sNama, sNim;
    private int iKata;
    
    public Tamu(String sNim, String sNama, int jKata){
        this.sNama = sNama;
        this.sNim = sNim;
        this.iKata = jKata;
    }
    
    public String getNama(){
        return this.sNama;
    }
    
    public String getNim(){
        return this.sNim;
    }
    
    public String getJumlahHalaman(){
        if (iKata > 100 && iKata < 500) {
            return String.valueOf(iKata*30);
        }
        else
            return "Tidak sesuai konten";
    }
}

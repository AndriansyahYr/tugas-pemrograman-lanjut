
package cerpen;


public class Cerpen1 {//class
    private String nim,nama;//attribut
    private int hal;//atribut
    
    public void data(String nim, String nama, int hal){//method
    this.nim=nim;
    this.nama=nama;
    this.hal=hal;
    }
    
    public int jumlahHalaman(){//method
    return hal*30;
    }
}

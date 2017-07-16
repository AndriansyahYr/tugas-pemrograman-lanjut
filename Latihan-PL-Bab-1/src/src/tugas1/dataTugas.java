/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author IANLORD
 */
public class dataTugas {
    private String nama;
    private String nim;
    private int halaman;
    
    public void pengisianData(String nama,String nim,int halaman){
        this.halaman = halaman;
        this.nama = nama;
        this.nim = nim;
        
    }
    public int penghitunganHalaman(){
    return halaman*30;
}
 
    
    
}

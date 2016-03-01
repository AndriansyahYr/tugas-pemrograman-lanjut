/* 
Nama  : Firman Budi Safrizal
Nim	  : 155150201111147
Kelas : TIF - H
*/

public class CerpenMahasiswa{
	private long nim;
	private String nama;
	private int jumlah_kata_hal;
	
	public void InputData(String nama, long nim, int jumlah_kata_hal){
		this.nim = nim;
		this.nama = nama;
		this.jumlah_kata_hal = jumlah_kata_hal;
	}
	
	public void showData(){
		System.out.println("Nama		: "+nama);
		System.out.println("NIM 		: "+nim);
		if(jumlah_kata_hal>100 && jumlah_kata_hal<500){
			System.out.println("Jumlah Kata per Halaman : "+jumlah_kata_hal);
			System.out.println("Jumlah Kata Satu Buku   : "+(jumlah_kata_hal * 30));
		} else{
			System.out.println("Jumlah Kata per Halaman : Data yang anda masukkan tidak memenuhi persyaratan! (100 < kata per halaman< 500)");
			System.out.println("Jumlah Kata 30 Halaman  : Data yang anda masukkan tidak memenuhi persyaratan! (100 < kata per halaman< 500)");
		}
	}
}
package package1;

public class SubClass {

	private String namaMahasiswa, nim;
	private int kataPerhalaman, jumlahKata;
	
	public String inputNama (String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
		return this.namaMahasiswa;
	}
	
	public String inputNim (String nim) {
		this.nim = nim;
		return this.nim;
	}
	
	public void inputKataPerhalaman (int kataPerhalaman) {
		this.kataPerhalaman = kataPerhalaman;
	}
	
	public void displayData () {
		System.out.println("Nama\t: "+namaMahasiswa);
		System.out.println("Nim\t: "+nim);
		System.out.println("Kata per halaman: "+kataPerhalaman);
	}
}	
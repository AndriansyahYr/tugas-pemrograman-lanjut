package package1;

public class SubClass {

	private String namaMahasiswa, nim;
	private int kataPerhalaman, jumlahKata;
	
	public void inputData (String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
		//this.nim = nim;
		//this.kataPerhalaman = kataPerhalaman;
		//this.jumlahKata = jumlahKata;
	}
	
	public void displayData () {
		System.out.println(namaMahasiswa);
	}
}	
package package1;

public class MainClass {

	public static void main(String[] args) {
		
		SubClass namaMahasiswa[] = new SubClass[5];
		
		for (int i = 0; i < namaMahasiswa.length; i++) {
			namaMahasiswa[i] = new SubClass();			
			namaMahasiswa[i].inputData("test");
			namaMahasiswa[i].displayData();
		}
	}
}
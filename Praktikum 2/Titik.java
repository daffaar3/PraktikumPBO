/*
Nama File 	: Titik.java
Pembuat		: Muhammad Daffa Ar Rosyid
NIM         : 24060121140107
Tanggal		: 1 Maret 2023
*/

class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;
		
	public Titik(){
		absis =0.0;
		ordinat= 0.0;
		counterTitik ++;
	}	
		
	public Titik(double a, double o){
		absis = a;
		ordinat= o;
		counterTitik ++;
	}	
	public void setAbsis (double a) {
		absis = a;
	}
			
	public void setOrdinat (double o) {
		ordinat = o;
	}
		
	public double getAbsis() {
		return absis;
	}
		
	public double getOrdinat() {
		return ordinat;
	}
			
	public static int counterTitik(){
		return counterTitik;
	}	
}
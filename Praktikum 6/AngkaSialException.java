/*
Nama File 	: AngkaSialException.java
Pembuat		: Muhammad Daffa Ar Rosyid
NIM         : 24060121140107
Deskripsi 	: Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}
/**
* File		: Segitiga.java 8 Maret 2023
* Penulis	: Muhammad Daffa Ar Rosyid
* NIM       : 24060121140107
* Deskripsi	: Representasi dari objek persegi panjang, turunan kelas poligon
*/
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return (alas * tinggi)/2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
	}
}
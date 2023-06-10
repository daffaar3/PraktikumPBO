/*
Nama File 	: Kubus.java
Pembuat		: Muhammad Daffa Ar Rosyid
NIM         : 24060121140107
Deskripsi 	: Representasi dari objek kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double sisi = permukaan.getPanjangSisi();
		return sisi * sisi * sisi;
	}
	
	public double hitungLuasAlas(){
		double sisi = permukaan.getPanjangSisi();
		return sisi * sisi;
	}
}
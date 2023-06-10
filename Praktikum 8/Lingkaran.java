/**
 * Nama file : Lingkaran.java
 * Penulis   : Muhammad Daffa Ar Rosyid
 * NIM       : 24060121140107
 * Deskripsi : implementasi lingkaran sebagai bangundatar
 * Tanggal   : 7 Juni 2023
 */
public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 *jejari*3.14;
    }
}

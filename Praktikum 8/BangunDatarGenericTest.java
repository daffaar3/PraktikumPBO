/**
 * Nama file : BangunDatarGenericTest.java
 * Penulis   : Muhammad Daffa Ar Rosyid
 * NIM       : 24060121140107
 * Deskripsi : main class untuk generic bagun datar
 * Tanggal   : 7 Juni 2023
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());
    }
}
/**
 * Nama file : MapTest.java
 * Penulis   : Muhammad Daffa Ar Rosyid
 * NIM       : 24060121140107
 * Deskripsi : Program yang menggunakan generic untuk pasangan kunci nilai-nilai
 * Tanggal   : 7 Juni 2023
 */


import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci->integer, nilai->string
        Map<Integer,String> map = new HashMap<Integer,String>();
        // menempatkan elemen kunci dan nilai
        map.put(1,"satu");
        map.put(2,"dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        // bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda
        // petunjuk: gunakan iterasi seperti program ArrayListTest

        // Menggunakan for untuk mendefinisikan k sebagai elemen dari key
        // Kemudian melakukan pencetakan ke layar dengan menggunakan k itu sendiri
        // untuk mendapatkan value dari k, dapat menggunakan operator get()
        for (Integer k : key) {
            System.out.println(k+" "+map.get(k));
        }
    }
}
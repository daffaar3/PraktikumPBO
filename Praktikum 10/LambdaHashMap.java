/**
 * Nama file : LambdaHashMap.java
 * Penulis   : Muhammad Daffa Ar Rosyid
 * NIM       : 24060121140107
 * Deskripsi : Implementasi lambda pada Hashmap
 * Tanggal   : 9 Juni 2023
 */

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashmap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121130047", "Benjamin Franklin Saloom Sipayung"); 
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama)); 
    } 
}
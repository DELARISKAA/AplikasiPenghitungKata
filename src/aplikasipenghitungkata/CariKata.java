/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenghitungkata;

/**
 *
 * @author user
 */
public class CariKata {
    public int CariKata(String teks, String carikata) {
    int count = 0;

    // Memeriksa jika carikata tidak null dan tidak kosong
    if (carikata != null && !carikata.isEmpty()) {
        // Memecah teks menjadi kata-kata
        String[] kataArray = teks.split("\\s+");  // Memecah teks menjadi array kata

        // Memecah carikata menjadi array kata-kata
        String[] cariKataArray = carikata.split("\\s+");  // Memecah carikata menjadi array kata-kata

        // Iterasi untuk setiap kata dalam carikata
        for (String kata : cariKataArray) {
            // Iterasi untuk setiap kata dalam teks
            for (String kataelemen : kataArray) {
                // Menghitung berapa kali kata ditemukan (case-insensitive)
                if (kataelemen.equalsIgnoreCase(kata)) {
                    count++;  // Increment count jika kata cocok
                }
            }
        }
    }
    return count; 
    }
}

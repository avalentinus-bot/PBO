import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LatihanCollection1 {
    public static void main(String[] args) {
        // 1. Membuat objek TreeSet bertipe String
        Set<String> daftarBuku = new TreeSet<String>();

        // 2. Menambahkan judul buku ke dalam Set
        daftarBuku.add("Dilan 1990");
        daftarBuku.add("Laskar Pelangi");
        daftarBuku.add("Mahaguru");
        daftarBuku.add("Mengejar Matahari");
        daftarBuku.add("Dilan 1991");
        daftarBuku.add("Milea");
        daftarBuku.add("Perahu Kertas");
        daftarBuku.add("Laskar Pelangi"); // Duplikat
        daftarBuku.add("Perahu Kertas");  // Duplikat

        // 3. Menampilkan daftar menggunakan Iterator
        System.out.println("Daftar Buku:");
        
        Iterator<String> iterator = daftarBuku.iterator();
        int nomor = 1;
        
        while (iterator.hasNext()) {
            System.out.println(nomor + ". " + iterator.next());
            nomor++;
        }
    }
}
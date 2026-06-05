import java.util.Set;
import java.util.TreeSet;

public class LatihanCollection2 {
    public static void main(String[] args) {
        // Inisialisasi daftar buku seperti di Latihan 1
        Set<String> daftarBuku = new TreeSet<String>();
        
        daftarBuku.add("Dilan 1990");
        daftarBuku.add("Laskar Pelangi");
        daftarBuku.add("Mahaguru");
        daftarBuku.add("Mengejar Matahari");
        daftarBuku.add("Dilan 1991");
        daftarBuku.add("Milea");
        daftarBuku.add("Perahu Kertas");

        // Menampilkan daftar buku urut dari awal
        System.out.println("Daftar Buku secara Urut:");
        int nomor = 1;
        for (String buku : daftarBuku) {
            System.out.println(nomor + ". " + buku);
            nomor++;
        }
        System.out.println(); // Mencetak baris kosong

        // Mengecek ketersediaan buku menggunakan method .contains()
        String cariBuku = "Mahaguru";
        if (daftarBuku.contains(cariBuku)) {
            System.out.println("Buku " + cariBuku + " ada\n");
            
            // Pengunjung meminjam buku, sehingga buku dihapus dari collection
            daftarBuku.remove(cariBuku);
        } else {
            System.out.println("Buku " + cariBuku + " tidak ada\n");
        }

        // Menampilkan daftar buku setelah dipinjam
        System.out.println("Daftar Buku setelah " + cariBuku + " dipinjam:");
        nomor = 1; // Reset nomor
        
        // Looping for tanpa menggunakan index
        for (String buku : daftarBuku) {
            System.out.println(nomor + ". " + buku);
            nomor++;
        }
    }
}
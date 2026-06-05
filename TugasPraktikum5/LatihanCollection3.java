import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class LatihanCollection3 {
    public static void main(String[] args) {
        // 1. Inisialisasi Map menggunakan TreeMap agar Key otomatis terurut abjad
        Map<String, String> techCompanies = new TreeMap<String, String>();

        // 2. Memasukkan data ke dalam object berdasarkan tabel
        // Format: .put(Key, Value)
        techCompanies.put("Microsoft", "Bill Gates");
        techCompanies.put("Apple", "Steven Paul Jobs");
        techCompanies.put("Linux", "Linux Benedict Torvalds");
        techCompanies.put("Facebook", "Mark Zuckerberg");
        techCompanies.put("Twitter", "Jack Dorsey");
        techCompanies.put("Instagram", "Kevin Systrom");

        // 3. Menampilkan hasil dengan perulangan
        int nomor = 1;
        // Mengambil semua kunci (Key) dari Map menggunakan keySet()
        for (String key : techCompanies.keySet()) {
            
            // Mengambil value berdasarkan key saat ini
            String value = techCompanies.get(key);
            
            // Mencetak output: mengubah key menjadi huruf besar dan merangkai kata
            System.out.println(nomor + ". " + key.toUpperCase() + " dikembangkan oleh " + value);
            
            nomor++;
        }
    }
}
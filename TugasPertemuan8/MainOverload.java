public class MainOverload {

    //Method main utama (Entry point yang dipanggil otomatis oleh JVM)
    public static void main(String[] args) {
        System.out.println("1. Method main(String[] args) UTAMA dieksekusi oleh JVM.");
        
        // Memanggil method main yang sudah di-overload secara manual
        main(100); 
        main("Pemrograman", "Polimorfisme");
    }

    //Overload method main (dengan 1 parameter int)
    public static void main(int angka) {
        System.out.println("2. Overload main() dipanggil dengan parameter int: " + angka);
    }

    //Overload method main (dengan 2 parameter String)
    public static void main(String kata1, String kata2) {
        System.out.println("3. Overload main() dipanggil dengan 2 String: " + kata1 + " & " + kata2);
    }
}
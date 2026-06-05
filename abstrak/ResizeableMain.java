package abstrak;

public class ResizeableMain {
    public static void main(String[] args) {
        // a. Mendefinisikan objek kotak
        Kotak kotakKu = new Kotak(4, 5);

        // b. Mencetak luas dan keliling objek
        System.out.println("=== SEBELUM RESIZE ===");
        System.out.println("Luas Kotak     : " + kotakKu.getLuas());
        System.out.println("Keliling Kotak : " + kotakKu.getKeliling());

        System.out.println("\nMelakukan proses resize...");
        // c. Mengubah ukuran panjang dan lebar sebesar 2x dari ukuran semula
        kotakKu.resize(2.0);

        // d. Mencetak kembali luas dan keliling objek
        System.out.println("\n=== SESUDAH RESIZE ===");
        System.out.println("Luas Kotak     : " + kotakKu.getLuas());
        System.out.println("Keliling Kotak : " + kotakKu.getKeliling());
    }
}
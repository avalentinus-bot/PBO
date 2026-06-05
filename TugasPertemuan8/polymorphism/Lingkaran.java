package polymorphism;

// Menambahkan subclass dari BangunDatar
public class Lingkaran extends BangunDatar {
    
    // Melakukan overload method luas khusus untuk bangun datar lingkaran
    public double luas(double jariJari) {
        // Rumus Luas Lingkaran = π * r * r
        return Math.PI * jariJari * jariJari;
    }
}
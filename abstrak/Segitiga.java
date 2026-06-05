package abstrak;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    // Constructor Segitiga
    public Segitiga(double alas, double tinggi) {
        super(3); //Segitiga otomatis memiliki 3 sisi
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Segitiga di koordinat (" + x + ")");
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Segitiga.");
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        //Menggunakan Pythagoras untuk mencari sisi miring
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
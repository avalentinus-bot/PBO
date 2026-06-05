package abstrak;

//Class Kotak mewarisi BangunDatar dan mengimplementasikan Resizeable
public class Kotak extends BangunDatar implements Resizeable {
    private double panjang;
    private double lebar;

    public Kotak(double panjang, double lebar) {
        super(4);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Kotak");
    }

    //method abstract bawaan dari class BangunDatar
    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Kotak (default).");
    }

    //method hasil implementasi dari interface Resizeable
    @Override
    public void resize(double x) {
        this.panjang = this.panjang * x;
        this.lebar = this.lebar * x;
        System.out.println("-> Berhasil memperbesar ukuran kotak sebanyak " + x + " kali.");
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}
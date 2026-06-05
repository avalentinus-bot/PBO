package polymorphism;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BangunDatar bd;
        
        //Membuat Scanner untuk menginput nilai
        Scanner inputan = new Scanner(System.in);
        
        // --- Persegi Panjang ---
        SegiEmpat persegiPanjang = new SegiEmpat();
        bd = persegiPanjang;
        
        System.out.println("Masukkan Panjang:");
        bd.panjang = inputan.nextDouble();
        
        System.out.println("Masukkan Lebar:");
        bd.lebar = inputan.nextDouble();
        
        double luas = bd.luas();
        bd.cetakLuas("Persegi panjang", luas);
        
        // --- Segitiga Siku-siku ---
        Segitiga sikusiku = new Segitiga();
        bd = sikusiku;
        
        System.out.println("Masukkan Panjang:");
        bd.panjang = inputan.nextDouble();
        
        System.out.println("Masukkan Tinggi:");
        bd.tinggi = inputan.nextDouble();
        
        // Melakukan pemanggilan method untuk menampilkan luas segitiga
        double luas1 = bd.luas(bd.panjang, bd.tinggi);
        bd.cetakLuas("Segitiga siku-siku", luas1);
        
        // --- Tambahan (Lingkaran) ---
        Lingkaran bulat = new Lingkaran();
        bd = bulat;
        
        System.out.println("Masukkan Jari-jari:");
        double r = inputan.nextDouble();
        
        double luasLingkaran = bulat.luas(r); 
        bd.cetakLuas("Lingkaran", luasLingkaran);
        
        inputan.close(); // Menutup scanner
    }
}
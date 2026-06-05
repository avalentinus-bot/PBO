package abstrak;

public class BangunDatarMain {
    public static void main(String[] args) {
        //Membuat objek Kotak
        Kotak kotakKu = new Kotak(6, 4);
        kotakKu.pindahkan(5, 10);
        
        System.out.println("=== KOTAK ===");
        kotakKu.draw();
        System.out.println("Jumlah Sisi: " + kotakKu.getJumlahSisi());
        System.out.println("Luas Kotak  : " + kotakKu.getLuas());
        System.out.println("Keliling    : " + kotakKu.getKeliling());

        System.out.println("\n-----------------------------\n");

        //Membuat objek Segitiga
        Segitiga segitigaKu = new Segitiga(6, 8);
        segitigaKu.pindahkan(12, 3);

        System.out.println("=== SEGITIGA ===");
        segitigaKu.draw();
        System.out.println("Jumlah Sisi: " + segitigaKu.getJumlahSisi());
        System.out.println("Luas Segitiga: " + segitigaKu.getLuas());
        System.out.println("Keliling     : " + segitigaKu.getKeliling());
    }
}
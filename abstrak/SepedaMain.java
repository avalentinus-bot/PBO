package abstrak;

public class SepedaMain {
    public static void main(String[] args) {
        // objek Sepeda kayuh (false)
        Sepeda sepedaOnthel = new Sepeda(false);
        sepedaOnthel.jenis();
        sepedaOnthel.nyalakan();
        
        System.out.println("-----------------");

        // objek Sepeda otomatis (true)
        Sepeda sepedaListrik = new Sepeda(true);
        sepedaListrik.jenis();
        sepedaListrik.nyalakan();
    }
}
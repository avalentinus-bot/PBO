package abstrak;

public class Sepeda extends Kendaraan {
    private boolean isAuto;

    //Constructor untuk menentukan nilai isAuto saat objek dibuat
    public Sepeda(boolean isAuto) {
        this.isAuto = isAuto;
    }

    public void jenis() {
        if (isAuto) {
            System.out.println("Sepeda otomatis");
        } else {
            System.out.println("Sepeda kayuh");
        }
    }

    //PERBAIKAN: override abstract method dari superclass Kendaraan
    @Override
    public void nyalakan() {
        System.out.println("Sepeda siap digunakan.");
    }
}
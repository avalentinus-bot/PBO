package abstrak;

public abstract class BangunDatar {
    private int jumlahSisi; 
    int x;
    private int y;
	
    //Constructor: mengisi nilai jumlahSisi
    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
    }

    //Mengubah parameter method pindahkan menjadi (x, y)
    public void pindahkan(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
    public abstract void draw();
    public abstract void resize();

    //Getter untuk jumlah sisi
    public int getJumlahSisi() {
        return jumlahSisi;
    }

    //Abstract method untuk menghitung luas dan keliling
    public abstract double getLuas();
    public abstract double getKeliling();
}
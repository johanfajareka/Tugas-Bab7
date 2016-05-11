package mainsalon;

public abstract class Salon {

    private String nama;
    private String id;
    private String alamat;
    private String telp;
    String diskon;
    double total;
    double layanan;
    final double krimbat = 50000;
    final double smothing = 80000;
    final double rebounding = 70000;
    double produk;
    final double sampo = 30000;
    final double sabun = 40000;
    final double kondisioner = 25000;

    public Salon(String nama, String id, String alamat, String telp) {
        this.nama = nama;
        this.id = id;
        this.alamat = alamat;
        this.telp = telp;
    }

    public void display() {
        System.out.println("===== >> Total Belanja << =====");
        System.out.println("");
        System.out.println("Nama        : " + nama);
        System.out.println("No. ID      : " + id);
        System.out.println("Alamat      : " + alamat);
        System.out.println("No. Telp    : " + telp);
        System.out.println("Diskon      : " + diskon);
    }

    public abstract double harga();

}

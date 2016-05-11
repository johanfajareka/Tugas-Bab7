package mainsalon;

public class Non extends Salon {

    public Non(String nama, String id, String alamat, String telp) {
        super(nama, id, alamat, telp);
    }

    public double layanan() {
        layanan = krimbat + smothing + rebounding;
        return layanan;
    }

    public double produk() {
        produk = sampo + sabun + kondisioner;
        return produk;
    }

    @Override
    public double harga() {
        total = layanan() + produk();
        return total;
    }

}

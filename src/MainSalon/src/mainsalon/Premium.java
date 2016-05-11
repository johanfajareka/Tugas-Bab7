package mainsalon;

public class Premium extends Salon {

    public Premium(String nama, String id, String alamat, String telp) {
        super(nama, id, alamat, telp);
    }

    public double layanan() {
        layanan = (krimbat + smothing + rebounding) * 0.8;
        return layanan;
    }

    public double produk() {
        produk = (sampo + sabun + kondisioner) * 0.9;
        return produk;
    }

    @Override
    public double harga() {

        total = layanan() + produk();
        return total;
    }

}

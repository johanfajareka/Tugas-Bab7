package mainsalon;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jawab;
        int pil;
        String nama;
        String id;
        String alamat;
        String telp;
        System.out.println("================== >> SALON MENU << ==================");
        System.out.println("");
        System.out.print("Masukkan Nama anda     : ");
        nama = in.next();
        System.out.print("Masukkan No. ID anda   : ");
        id = in.next();
        System.out.print("Masukkan Alamat anda   : ");
        alamat = in.next();
        System.out.print("Masukkan No. Telp anda : ");
        telp = in.next();
        System.out.println("Apakah anda terdaftar sebagai anggota Salon Cantik ???");
        System.out.print("Jawab (iya/tidak) : ");
        jawab = in.next();
        System.out.println("");
        if ("iya".equals(jawab)) {
            for (;;) {
                System.out.println("========= PILIHAN PAKET KEANGGOTAAN =========");
                System.out.println("1. Premium ");
                System.out.println("2. Gold ");
                System.out.println("3. Silver ");
                System.out.print("Masukkan Pilihan anda : ");
                pil = in.nextInt();
                switch (pil) {
                    case 1:
                        for (;;) {
                            Premium a = new Premium(nama, id, alamat, telp);
                            a.diskon = "20%";
                            System.out.println("");
                            System.out.println("================= >>> MENU <<< =================");
                            System.out.println("1. Gunakan Layanan "
                                    + "(Krimbat = Rp.50.000,- + "
                                    + " Smothing = Rp.80.000,- + "
                                    + " Rebonding = Rp.70.000,-)");
                            System.out.println("2. Beli Produk "
                                    + "(Sampo = Rp.30.000,- + "
                                    + " Sabun = Rp.40.000,- + "
                                    + " Kondisioner = Rp.25.000,-)");
                            System.out.println("3. Lihat Harga");
                            System.out.println("4. Keluar Program");
                            System.out.print("Masukkan Pilihan : ");
                            pil = in.nextInt();
                            switch (pil) {
                                case 1:
                                    a.layanan();
                                    break;
                                case 2:
                                    a.produk();
                                    break;
                                case 3:
                                    a.display();
                                    System.out.println("Harga Layanan = Rp " + a.layanan());
                                    System.out.println("Harga Produk  = Rp " + a.produk());
                                    System.out.println("Total Harga   = Rp " + a.harga());
                                    break;
                                case 4:
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan pilihan yang benar...");
                            }

                        }
                    case 2:
                        for (;;) {
                            Gold a = new Gold(nama, id, alamat, telp);
                            a.diskon = "15%";
                            System.out.println("");
                            System.out.println("================= >>> MENU <<< =================");
                            System.out.println("1. Gunakan Layanan "
                                    + "(Krimbat = Rp.50.000,- + "
                                    + " Smothing = Rp.80.000,- + "
                                    + " Rebonding = Rp.70.000,-)");
                            System.out.println("2. Beli Produk "
                                    + "(Sampo = Rp.30.000,- + "
                                    + " Sabun = Rp.40.000,- + "
                                    + " Kondisioner = Rp.25.000,-)");
                            System.out.println("3. Lihat Harga");
                            System.out.println("4. Keluar Program");
                            System.out.print("Masukkan Pilihan : ");
                            pil = in.nextInt();
                            switch (pil) {
                                case 1:
                                    a.layanan();
                                    break;
                                case 2:
                                    a.produk();
                                    break;
                                case 3:
                                    a.display();
                                    System.out.println("Harga Layanan = Rp " + a.layanan());
                                    System.out.println("Harga Produk  = Rp " + a.produk());
                                    System.out.println("Total Harga   = Rp " + a.harga());
                                    break;
                                case 4:
                                    System.exit(0);
                                default:
                                    System.out.println("Masukkan pilihan yang benar...");
                            }

                        }
                    
                    
    }

}

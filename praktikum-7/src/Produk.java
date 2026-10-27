public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil. Sisa stok " + namaProduk + ": " + stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + String.format("%,.0f", harga));
        System.out.println("Stok        : " + stok);
    }

    // Latihan 3
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
public class LatihanEncapProduk {
    public static void main(String[] args) {
        Produk p = new Produk("P001", "Buku Tulis", 5000, 10);
        p.tampilkanData();

        System.out.println("\n--- setHarga ---");
        p.setHarga(7500);
        p.setHarga(-100);
        System.out.println("Harga sekarang: " + p.getHarga());

        System.out.println("\n--- tambahStok ---");
        p.tambahStok(5);
        p.tambahStok(0);

        System.out.println("\n--- kurangiStok ---");
        p.kurangiStok(3);
        p.kurangiStok(100);
        p.kurangiStok(-2);
        System.out.println("Stok akhir: " + p.getStok());
    }
}
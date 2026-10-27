public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftar = new Produk[5];
        daftar[0] = new Produk("P001", "Laptop", 8500000, 5);
        daftar[1] = new Produk("P002", "Mouse", 150000, 20);
        daftar[2] = new Produk("P003", "Keyboard", 350000, 10);
        daftar[3] = new Produk("P004", "Monitor", 2200000, 3);
        daftar[4] = new Produk("P005", "Headset", 450000, 8);

        // 1. Tampilkan seluruh data produk
        System.out.println("=== DAFTAR PRODUK ===");
        for (Produk p : daftar) {
            p.tampilkanData();
            System.out.println("---");
        }

        // 2. Simulasi pembelian 1: stok mencukupi
        System.out.println("=== PEMBELIAN 1: Mouse x 4 ===");
        int jumlah1 = 4;
        System.out.println("Total harga: Rp" + String.format("%,.0f", daftar[1].hitungTotalHarga(jumlah1)));
        daftar[1].kurangiStok(jumlah1);

        // 3. Simulasi pembelian 2: stok TIDAK mencukupi
        System.out.println("\n=== PEMBELIAN 2: Monitor x 5 ===");
        int jumlah2 = 5;
        System.out.println("Total harga: Rp" + String.format("%,.0f", daftar[3].hitungTotalHarga(jumlah2)));
        daftar[3].kurangiStok(jumlah2);

        // 4. Cari produk termahal
        Produk termahal = daftar[0];
        for (Produk p : daftar) {
            if (p.getHarga () > termahal.getHarga()) {
                termahal = p;
            }
        }
        System.out.println("\n=== PRODUK TERMAHAL ===");
        termahal.tampilkanData();
    }
}
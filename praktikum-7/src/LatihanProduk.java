public class LatihanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Buku", 15000, 10);
        Produk p2 = new Produk("P002", "Tas", 120000, 5);

        System.out.println("Produk: " + p1.getNamaProduk());
        System.out.println("Harga: " + p1.getHarga());
        System.out.println("Mahal? " + p1.isMahal(50000));

        System.out.println();

        System.out.println("Produk: " + p2.getNamaProduk());
        System.out.println("Harga: " + p2.getHarga());
        System.out.println("Mahal? " + p2.isMahal(50000));
    }
}
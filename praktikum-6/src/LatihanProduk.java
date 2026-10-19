public class LatihanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("Buku", 15000);
        Produk p2 = new Produk("Tas", 120000);

        System.out.println("Produk: " + p1.namaProduk);
        System.out.println("Harga: " + p1.harga);
        System.out.println("Mahal? " + p1.isMahal(50000));

        System.out.println();

        System.out.println("Produk: " + p2.namaProduk);
        System.out.println("Harga: " + p2.harga);
        System.out.println("Mahal? " + p2.isMahal(50000));
    }
}
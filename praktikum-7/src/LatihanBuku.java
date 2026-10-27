public class LatihanBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java", "Andi Wijaya", 2018);
        Buku b2 = new Buku("Struktur Data", "Rina Putri", 2014);

        System.out.println("Judul     : " + b1.getJudul());
        System.out.println("Pengarang : " + b1.getPengarang());
        System.out.println("Terbit    : " + b1.getTahunTerbit());

        b2.setJudul("Struktur Data dan Algoritma");
        b2.setPengarang("Rina Putri, M.Kom");
        System.out.println();
        b2.tampilkanData();
    }
}
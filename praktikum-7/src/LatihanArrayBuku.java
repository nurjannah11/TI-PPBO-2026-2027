public class LatihanArrayBuku {
    public static void main(String[] args) {
        Buku[] daftar = new Buku[4];
        daftar[0] = new Buku("Pemrograman Java", "Andi Wijaya", 2018);
        daftar[1] = new Buku("Struktur Data", "Rina Putri", 2014);
        daftar[2] = new Buku("Basis Data", "Dewi Lestari", 2020);
        daftar[3] = new Buku("Jaringan Komputer", "Budi Santoso", 2012);

        System.out.println("Buku yang terbit setelah tahun 2015:");
        for (Buku b : daftar) {
            if (b.getTahunTerbit() > 2015) {
                System.out.println("- " + b.getJudul() + " (" + b.getTahunTerbit() + ")");
            }
        }
    }
}
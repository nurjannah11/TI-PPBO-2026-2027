public class latihanclass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "budi";
        m1.nim ="12345";
        m1.ipk ="3.75";

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Siti";
        m2.nim ="123456";
        m2.ipk ="3.90";

        Mahasiswa m3 = new Mahasiswa();
        m3.nama = "Andi";
        m3.nim ="12347";
        m3.ipk ="3.50";

        System.out.println("=== DATA MAHASISWA 1 ===");
        System.out.println("Nama: " +m1.nama);
        System.out.println("nim:" + m1.nim);
        System.out.println("ipk:" + m1.ipk);

        System.out.println("\n===DATA MAHASISWA 2 ===");
        System.out.println("Nama: " +m2.nama);
        System.out.println("nim:" + m2.nim);
        System.out.println("ipk:" + m2.ipk);

        System.out.println("\n===DATA MAHASISWA 3 ===");
        System.out.println("Nama: " +m3.nama);
        System.out.println("nim:" + m3.nim);
        System.out.println("ipk:" + m3.ipk);

    }
}
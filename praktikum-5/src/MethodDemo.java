public class MethodDemo {
    // method void: tidak mengembalikan nilai apapun
    static void sapa(String nama) {
        System.out.println("Halo," + nama +"!");
    }
    static void tampilkanBiodata(String nama, int umur, String kota) {
    System.out.println("Nama:" + nama);
    System.out.println("Umur:" + umur);
    System.out.println("Kota:" + kota);
    }

public static void main(String[] args) {
    sapa("Budi");
    sapa("siti");

    tampilkanBiodata("Budi", 20, "Bandung");
}
}

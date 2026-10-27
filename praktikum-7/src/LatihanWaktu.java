public class LatihanWaktu {
    public static void main(String[] args) {
        Waktu w = new Waktu(10, 30, 45);
        System.out.print("Waktu awal: ");
        w.tampilkanWaktu();

        w.setJam(15);
        w.setMenit(75);
        w.setDetik(-5);
        w.setJam(24);

        System.out.print("Waktu sekarang: ");
        w.tampilkanWaktu();
    }
}
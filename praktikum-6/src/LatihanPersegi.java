public class LatihanPersegi {
    public static void main(String[] args) {
        persegi p1 = new persegi(4);
        persegi p2 = new persegi(6);
        persegi p3 = new persegi(8);

        System.out.println("Persegi 1");
        System.out.println("Sisi: " + p1.sisi);
        System.out.println("Luas: " + p1.hitungluas ());
        System.out.println("Keliling: " + p1.hitungKeliling());

        System.out.println();

        System.out.println("Persegi 2");
        System.out.println("Sisi: " + p2.sisi);
        System.out.println("Luas: " + p2.hitungluas());
        System.out.println("Keliling: " + p2.hitungKeliling());

        System.out.println();

        System.out.println("Persegi 3");
        System.out.println("Sisi: " + p3.sisi);
        System.out.println("Luas: " + p3.hitungluas());
        System.out.println("Keliling: " + p3.hitungKeliling());
    }
}
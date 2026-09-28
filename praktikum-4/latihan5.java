public class latihan5 {
    public static void main(String[] args) {
        int[] angka = {10, 25, 8, 40, 30};

        int terbesar = angka[0];
        int terbesarKedua = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = angka[i];
            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {
                terbesarKedua = angka[i];
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Nilai terbesar kedua: " + terbesarKedua);
    }
}
public class latihan6 {
    public static void main(String[] args) {

        int[] angka = {40, 10, 30, 20, 50};

        System.out.println("Sebelum diurutkan:");

        for (int n : angka) {
            System.out.print(n + " ");
        }

        // Bubble Sort
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - 1 - i; j++) {

                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Setelah diurutkan:");

        for (int n : angka) {
            System.out.print(n + " ");
        }
    }
}
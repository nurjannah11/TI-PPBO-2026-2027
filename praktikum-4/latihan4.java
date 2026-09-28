public class latihan4 {
    public static void main(String[] args) {

        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int totalKeseluruhan = 0;

        for (int i = 0; i < matriks.length; i++) {

            int totalBaris = 0;

            for (int j = 0; j < matriks[i].length; j++) {
                totalBaris += matriks[i][j];
                totalKeseluruhan += matriks[i][j];
            }

            System.out.println("Total baris " + (i + 1) + ": " + totalBaris);
        }

        System.out.println("Total keseluruhan: " + totalKeseluruhan);
    }
}
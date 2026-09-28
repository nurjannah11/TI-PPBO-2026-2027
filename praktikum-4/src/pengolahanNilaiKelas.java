import java.util.Scanner;

public class pengolahanNilaiKelas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        // Input nilai mahasiswa
        System.out.println("\nMasukkan nilai mahasiswa:");

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Menghitung total nilai
        int total = 0;

        for (int nIlai : nilai) {
            total += nIlai;
        }

        // Menghitung rata-rata
        double rataRata = (double) total / n;

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Menghitung jumlah lulus dan tidak lulus
        int kkm = 70;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int nIlai : nilai) {
            if (nIlai >= kkm) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Sorting ascending menggunakan Bubble Sort manual
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan laporan
        System.out.println("\n===== LAPORAN NILAI KELAS =====");
        System.out.println("Jumlah mahasiswa : " + n);
        System.out.println("Rata-rata        : " + rataRata);
        System.out.println("Nilai tertinggi  : " + tertinggi);
        System.out.println("Nilai terendah   : " + terendah);
        System.out.println("Jumlah lulus     : " + jumlahLulus);
        System.out.println("Jumlah tidak lulus: " + jumlahTidakLulus);

        System.out.println("\nNilai setelah diurutkan:");
        for (int nIlai : nilai) {
            System.out.print(nIlai + " ");
        }

        sc.close();
    }
}
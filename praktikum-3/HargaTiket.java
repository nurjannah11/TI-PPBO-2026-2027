import  java.util.Scanner;
public class HargaTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        int harga;
        if (mahasiswa && umur < 25) {
            harga = 30000;
        } else if (umur < 12) {
            harga = 20000;
        } else {
            harga = 50000;
        }
        System.out.print("Harga tiket: Rp " + harga);
    }
}



import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double TARIF_450 = 500;
        final double TARIF_900 = 1000;
        final double TARIF_1300 = 1500;
        final double TARIF_2200 = 1700;
        final double TARIF_DIATAS_2200 = 2000;

        System.out.print("Masukkan daya listrik (VA): ");
        int daya = sc.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = sc.nextDouble();

        if (kwh <= 0) {
            System.out.println("Pemakaian kWh harus lebih dari 0.");
            return;
        }

        double tarif;

        if (daya == 450) {
            tarif = TARIF_450;
        } else if (daya == 900) {
            tarif = TARIF_900;
        } else if (daya == 1300) {
            tarif = TARIF_1300;
        } else if (daya == 2200) {
            tarif = TARIF_2200;
        } else if (daya > 2200) {
            tarif = TARIF_DIATAS_2200;
        } else {
            System.out.println("Daya listrik tidak valid.");
            return;
        }

        double total = tarif * kwh;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Daya           : " + daya + " VA");
        System.out.println("Pemakaian      : " + kwh + " kWh");
        System.out.println("Tarif per kWh  : Rp" + tarif);
        System.out.println("Total biaya    : Rp" + total);
    }
}
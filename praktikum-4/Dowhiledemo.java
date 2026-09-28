import java.util.Scanner;
public class Dowhiledemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = sc.nextInt();

            System.out.print("anda memasukkan: " + angka);
        } while (angka != 0);
        System.out.println("program berhenti");
        }
    }


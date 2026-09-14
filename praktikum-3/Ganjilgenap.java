import java.util.Scanner;

public class Ganjilgenap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("masukkan bilangan: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.print("Bilangan Genap");
        } else {
            System.out.print("Bilangan Ganjil");
        }
    }
}

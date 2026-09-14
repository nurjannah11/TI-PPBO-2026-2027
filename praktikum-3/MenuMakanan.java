import  java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("=== MENU MAKANAN ===");
        System.out.println("1. Nasi goreng");
        System.out.println("2. Mie ayam");
        System.out.println("3. Ayam geprek");
        System.out.println("4. Sate ayam");

        System.out.println("Pilih menu (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Anda memilih Nasi goreng");
                break;
            case 2:
                System.out.print("Anda memilih Mie ayam");
                break;
            case 3:
                System.out.print("Anda memilih Ayam geprek");
                break;
            case 4:
                System.out.print("Anda memilih Sate ayam");
                break;
            default:
                System.out.print("pilihan tidak valid");
        }
    }
}

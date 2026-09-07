import java.util.Scanner;

/*
Nama    : Nurjannah
NIM     : 2025573010108
Prodi   : Teknik Informatika
*/

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan panjang: ");
        double panjang = sc.nextDouble();

        System.out.println("Masukkan lebar: ");
        double lebar = sc.nextDouble();

        double luaspersegipanjang = panjang * lebar;
        double kelilingpersegipanjang = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luaspersegipanjang);
        System.out.println("keliling persegi panjang: " + kelilingpersegipanjang);

        System.out.println("Masukkan jari-jari: ");
        double jariJari = sc.nextDouble();

        double luaslingkaran = Math.PI * jariJari *jariJari;
        double kelilinglingkaran = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran: " + luaslingkaran);
        System.out.println("keliling lingkaran: " + kelilinglingkaran);

        boolean luasBesar = luaspersegipanjang > luaslingkaran;

        System.out.println("Apakah luas persegi panjang lebih besar dari lingkaran? " + luasBesar);

        }
    }

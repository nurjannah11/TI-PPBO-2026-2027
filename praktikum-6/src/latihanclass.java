import java.util.Scanner;

public class latihanclass {
    public  static void main(String[] args) {
        Mahasiswa m2 = new Mahasiswa("Siti", "123456", 3.90);
        m2.tampilkanData();
        System.out.println("Cumlaude?" + m2.isCumlaude());
    }
    }
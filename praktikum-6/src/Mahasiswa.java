public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    // Constructor dengan parameter
    public Mahasiswa(String namaAwal, String nimAwal, double ipkAwal) {
        this.nama = namaAwal;
        this.nim = nimAwal;
        this.ipk = ipkAwal;
    }

    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
    }

    public boolean isCumlaude() {
        return ipk >= 3.5;
    }
}

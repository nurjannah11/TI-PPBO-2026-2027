public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening;   // read-only: tanpa setter
    private double saldo;

    // Saldo awal negatif dianggap 0
    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    public String getNomorRekening() { return nomorRekening; }
    public String getPemilik() { return pemilik; }
    public String getJenisRekening() { return jenisRekening; }
    public double getSaldo() { return saldo; }

    // Setor: jumlah harus lebih dari 0
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    // Tarik: jumlah harus lebih dari 0 dan tidak melebihi saldo
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    // Transfer: validasi tujuan, jumlah positif, dan saldo pengirim cukup
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer gagal: rekening tujuan tidak valid");
        } else if (jumlah <= 0) {
            System.out.println("Transfer gagal: jumlah transfer harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal: saldo " + pemilik + " tidak mencukupi");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer berhasil: " + pemilik + " -> " + tujuan.pemilik
                    + " sebesar " + jumlah);
        }
    }

    // Cetak mutasi dengan format laporan
    public void cetakMutasi() {
        System.out.println("==============================");
        System.out.println("        MUTASI REKENING       ");
        System.out.println("==============================");
        System.out.println("No. Rekening : " + nomorRekening);
        System.out.println("Pemilik      : " + pemilik);
        System.out.println("Jenis        : " + jenisRekening);
        System.out.println("Saldo        : Rp" + String.format("%,.0f", saldo));
        System.out.println("==============================");
    }
}
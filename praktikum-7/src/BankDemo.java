public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank("001", "Budi", "Tabungan", 100000);
        RekeningBank rek2 = new RekeningBank("002", "Siti", "Giro", 200000);

        System.out.println("--- Setor dan tarik rekening Budi ---");
        rek1.setor(50000);
        rek1.tarik(30000);
        rek1.tarik(500000);   // ditolak: saldo tidak cukup
        rek1.setor(-1000);    // ditolak: jumlah tidak valid

        System.out.println("\n--- Setor dan tarik rekening Siti ---");
        rek2.setor(100000);
        rek2.tarik(50000);

        System.out.println("\n--- Transfer ---");
        rek1.transferKe(rek2, 70000);    // berhasil
        rek1.transferKe(rek2, 900000);   // gagal: saldo tidak cukup
        rek2.transferKe(rek1, -5000);    // gagal: jumlah tidak valid

        System.out.println("\n--- Mutasi akhir ---");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
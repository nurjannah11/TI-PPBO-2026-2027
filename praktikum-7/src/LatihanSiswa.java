public class LatihanSiswa {
    public static void main(String[] args) {
        Siswa s = new Siswa(88);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        s.setNilai(72);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        s.setNilai(150);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

        s.setNilai(30);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());
    }
}
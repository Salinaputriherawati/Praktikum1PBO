public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();

        mahasiswa1.name = "Lina";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.npm = 231078;
        mahasiswa1.modifikasi();
        mahasiswa1.membaca();
        mahasiswa1.nyontek();
        System.out.println();

        mahasiswa2.name = "Haikal";
        mahasiswa2.jurusan = "Sistem Informasi";
        mahasiswa2.npm = 231013;
        mahasiswa2.modifikasi();
        mahasiswa2.membaca();
        System.out.println();

        mahasiswa3.name = "Hera";
        mahasiswa3.jurusan = "Farmasi";
        mahasiswa3.npm = 231009;
        mahasiswa3.modifikasi();
        mahasiswa3.nyontek();
        System.out.println();
    }
    
}

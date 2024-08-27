public class DemoNilai {
    public static void main(String[] args) {
        Nilai mahasiswa1 = new Nilai();
        Nilai mahasiswa2 = new Nilai();
        Nilai mahasiswa3 = new Nilai();
        Nilai mahasiswa4 = new Nilai();
        Nilai mahasiswa5 = new Nilai();

        mahasiswa1.name = "Putri";
        mahasiswa1.npm = 231048;
        mahasiswa1.absen = 100;
        mahasiswa1.tugas = 95;
        mahasiswa1.uts = 90;
        mahasiswa1.uas = 99;
        mahasiswa1.Nilai();
        mahasiswa1.CetakNilai();
        System.out.println();

        mahasiswa2.name = "Satria";
        mahasiswa2.npm = 231010;
        mahasiswa2.absen = 98;
        mahasiswa2.tugas = 89;
        mahasiswa2.uts = 90;
        mahasiswa2.uas = 97;
        mahasiswa2.Nilai();
        mahasiswa2.CetakNilai();
        System.out.println();

        mahasiswa3.name = "Dila";
        mahasiswa3.npm = 231075;
        mahasiswa3.absen = 100;
        mahasiswa3.tugas = 90;
        mahasiswa3.uts = 97;
        mahasiswa3.uas = 90;
        mahasiswa3.Nilai();
        mahasiswa3.CetakNilai();
        System.out.println();

        mahasiswa4.name = "Azizah";
        mahasiswa4.npm = 231011;
        mahasiswa4.absen = 100;
        mahasiswa4.tugas = 85;
        mahasiswa4.uts = 79;
        mahasiswa4.uas = 87;
        mahasiswa4.Nilai();
        mahasiswa4.CetakNilai();
        System.out.println();

        mahasiswa5.name = "Faris";
        mahasiswa5.npm = 231015;
        mahasiswa5.absen = 95;
        mahasiswa5.tugas = 85;
        mahasiswa5.uts = 89;
        mahasiswa5.uas = 90;
        mahasiswa5.Nilai();
        mahasiswa5.CetakNilai();

    }
}

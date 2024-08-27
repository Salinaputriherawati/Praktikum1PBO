public class Mahasiswa{
    String name, jurusan;
    int npm;

    void membaca(){
        System.out.println ("Mahasiswa ditugaskan mereview jurnal yang berhubungan dengan pemrograman berorientasi objek");
    }
    
    void nyontek(){
        System.out.println ("Mahasiswa tidak boleh mencotek hasil review dari temen sekelasnya");
    }

    void modifikasi(){
        System.out.println ("Nama: " + this.name);
        System.out.println ("NPM: " + this.npm);
        System.out.println ("Prodi: " + this.jurusan);
        System.out.println ("Hasil dari review jurnal dikumpulkan di google form dengan file word paling lambat hari rabu pukul 23.00"    );

    }
}
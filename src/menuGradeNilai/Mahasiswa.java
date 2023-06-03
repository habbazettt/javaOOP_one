package menuGradeNilai;

public class Mahasiswa {
    private int nim;
    private String nama;
    private String jurusan;

    public Mahasiswa(int nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }
}

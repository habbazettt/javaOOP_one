package menuGradeNilai;

public class nilaiMahsiswa extends Mahasiswa {
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;
    private double nilaiAkhir;
    
    public nilaiMahsiswa(int nim, String nama, String jurusan, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        super(nim, nama, jurusan);
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = 0.3 * getNilaiTugas() + 0.3 * getNilaiUTS() + 0.4 * getNilaiUAS();
        return nilaiAkhir;
    }

    public String cetakGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir <= 100 && nilaiAkhir >= 90) {
            return "A";
        } else if (nilaiAkhir <= 89 && nilaiAkhir >= 80) {
            return "B";
        } else if (nilaiAkhir <= 79 && nilaiAkhir >= 70) {
            return "C";
        } else if (nilaiAkhir <= 69 && nilaiAkhir >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}
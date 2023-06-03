package menuHonor;

public class Karyawan {
    private String nama;
    private int golongan;
    private String pendidikan;
    private int jamKerja;

    public String getNama() {
        return nama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public int getGolongan() {
        return golongan;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public Karyawan(String nama, int golongan, String pendidikan, int jamKerja) {
        this.nama = nama;
        this.golongan = golongan;
        this.pendidikan = pendidikan;
        this.jamKerja = jamKerja;
    }

    private int tunjanganJabatan;
    private int tunjanganPendidikan;
    private int honorLembur;
    private final int honorTetap = 3000000;

    public void hitungTunjanganJabatan() {
        switch (golongan) {
            case 1 -> {
                tunjanganJabatan = (int) (0.05 * honorTetap);
                break;
            }
            case 2 -> {
                tunjanganJabatan = (int) (0.1 * honorTetap);
                break;
            }
            case 3 -> {
                tunjanganJabatan = (int) (0.15 * honorTetap);
                break;
            }
            default -> {
                tunjanganJabatan = 0;
                break;
            }
        }
    }

    public void hitungTunjanganPendidikan() {
        switch (pendidikan) {
            case "SMU":
                tunjanganPendidikan = 0;
                break;
            case "D3":
                tunjanganPendidikan = (int) (0.025 * honorTetap);
                break;
            case "S1":
                tunjanganPendidikan = (int) (0.05 * honorTetap);
                break;
            default:
                tunjanganPendidikan = 0;
                break;
        }
    }

    public void hitungHonorLembur() {
        int jamLembur = jamKerja - 8;
        if (jamLembur > 0) {
            honorLembur = jamLembur * 2500;
        } else {
            honorLembur = 0;
        }
    }

    public void tampilTotal() {
        int totalHonor = honorTetap + tunjanganJabatan + tunjanganPendidikan + honorLembur;
        System.out.println("Total Honor: " + totalHonor);
    }

    public int getHonorTetap() {
        return honorTetap;
    }

    public int getTunjanganPendidikan() {
        return tunjanganPendidikan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public int getHonorLembur() {
        return honorLembur;
    }
}

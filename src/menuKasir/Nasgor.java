package menuKasir;

public class Nasgor extends Makanan{
    private final int hargaPokok = 14000;
    private int hargaLevel;

    @Override
    public void hitungHargaLevel(int level) {
        if (level >= 1 && level <= 5) {
            hargaLevel = 2000;
        } else if (level >= 6 && level <= 10) {
            hargaLevel = 3000;
        }
    }

    @Override
    public int hitungTotal(int hargaPokok, int hargalevel) {
        int hargaTotal = hargaPokok + hargalevel;
        return hargaTotal;
    }

    public int getHargaPokok() {
        return hargaPokok;
    }

    public int getHargaLevel() {
        return hargaLevel;
    }
}

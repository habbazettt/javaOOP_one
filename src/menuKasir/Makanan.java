package menuKasir;

abstract class Makanan {
    abstract void hitungHargaLevel(int level);

    abstract int hitungTotal(int hargaPokok, int hargalevel);
}

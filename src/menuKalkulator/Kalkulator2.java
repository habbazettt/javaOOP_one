package menuKalkulator;

public class Kalkulator2 extends Kalkulator{
    private double bil1;
    private double bil2;

    public Kalkulator2(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }


    @Override
    public double penjumlahan() {
        return bil1 + bil2;
    }

    @Override
    public double pengurangan() {
        return bil1 - bil2;
    }

    @Override
    public double perkalian() {
        return bil1 * bil2;
    }

    @Override
    public double pembagian() {
        return bil1 / bil2;
    }
}

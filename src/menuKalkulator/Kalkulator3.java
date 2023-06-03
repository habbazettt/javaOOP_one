package menuKalkulator;

public class Kalkulator3 extends Kalkulator{
    private double bil1;
    private double bil2;
    private double bil3;

    public Kalkulator3(double bil1, double bil2, double bil3) {
        this.bil1 = bil1;
        this.bil2 = bil2;
        this.bil3 = bil3;
    }


    @Override
    public double penjumlahan() {
        return bil1 + bil2 + bil3;
    }

    @Override
    public double pengurangan() {
        return bil1 - bil2 - bil3;
    }

    @Override
    public double perkalian() {
        return bil1 * bil2 * bil3;
    }

    @Override
    public double pembagian() {
        return bil1 / bil2 / bil3;
    }
}

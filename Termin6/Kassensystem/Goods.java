package Termin6.Kassensystem;

public class Goods extends Product {
    private final ClassOfGoods classOfGoods;

    public Goods(int id, String description, String unit, double priceInEuro, ClassOfGoods classOfGoods) {
        super(id, description, unit, priceInEuro);
        this.classOfGoods = classOfGoods;
    }

    public ClassOfGoods getClassOfGoods() {
        return this.classOfGoods;
    }
}
package pl.sda.rafal.zientara.programowanie2.lesson4.money;

import java.time.LocalDate;

public class Cost {

    private final String shoopName;
    private final double price;
    private final LocalDate date;

    public Cost(String shoopName, double price, LocalDate date) {
        this.shoopName = shoopName;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "shop: "+ shoopName+ '\''+ " price: " + price + '\'' + " date: "+ date;
    }
}

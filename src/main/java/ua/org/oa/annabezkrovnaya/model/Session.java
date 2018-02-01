package ua.org.oa.annabezkrovnaya.model;

import java.time.LocalTime;
import java.util.Objects;

public class Session extends Entity<Integer> {

    private LocalTime startTime;
    private double price;
    private double discount;

    public Session(LocalTime startTime, double price, double discount){
        this.startTime = startTime;
        this.price = price;
        this.discount = discount;
    }

    public Session() {
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Session session = (Session) o;
        return Double.compare(session.price, price) == 0 &&
                Double.compare(session.discount, discount) == 0 &&
                Objects.equals(startTime, session.startTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), startTime, price, discount);
    }

    @Override
    public String toString() {
        return "Session{" +
                "startTime=" + startTime +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}

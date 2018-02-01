package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.Entity;
import java.time.LocalTime;

public class SessionDTO extends Entity<Integer> {
    private LocalTime startTime;
    private double price;
    private double discount;

    public SessionDTO() {
    }

    public SessionDTO(LocalTime startTime, double price, double discount) {
        this.startTime = startTime;
        this.price = price;
        this.discount = discount;
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
    public String toString() {
        return "SessionDTO{" +
                "startTime=" + startTime +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}

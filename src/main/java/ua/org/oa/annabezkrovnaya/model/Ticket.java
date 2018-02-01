package ua.org.oa.annabezkrovnaya.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Ticket extends Entity<Integer> {
    private LocalDate currentDate;
    private LocalTime currentTime;
    private String currentMovieTitle;
    private int currentRow;
    private int currentSeat;
    private double currentPrice;
    private double currentDiscount;
    private String tempQRUrl;

    public Ticket() {
    }

    public Ticket(LocalDate currentDate, LocalTime currentTime, String currentMovieTitle, int currentRow, int currentSeat, double currentPrice, double currentDiscount) {
        this.currentDate = currentDate;
        this.currentTime = currentTime;
        this.currentMovieTitle = currentMovieTitle;
        this.currentRow = currentRow;
        this.currentSeat = currentSeat;
        this.currentPrice = currentPrice;
        this.currentDiscount = currentDiscount;
    }

    public Ticket(LocalDate currentDate, LocalTime currentTime, String currentMovieTitle, int currentRow, int currentSeat, double currentPrice) {
        this.currentDate = currentDate;
        this.currentTime = currentTime;
        this.currentMovieTitle = currentMovieTitle;
        this.currentRow = currentRow;
        this.currentSeat = currentSeat;
        this.currentPrice = currentPrice;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public LocalTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentMovieTitle() {
        return currentMovieTitle;
    }

    public void setCurrentMovieTitle(String currentMovieTitle) {
        this.currentMovieTitle = currentMovieTitle;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentSeat() {
        return currentSeat;
    }

    public void setCurrentSeat(int currentSeat) {
        this.currentSeat = currentSeat;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }

    public String getTempQRUrl() {
        return tempQRUrl;
    }

    public void setTempQRUrl(String tempQRUrl) {
        this.tempQRUrl = tempQRUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return currentRow == ticket.currentRow &&
                currentSeat == ticket.currentSeat &&
                Double.compare(ticket.currentPrice, currentPrice) == 0 &&
                Double.compare(ticket.currentDiscount, currentDiscount) == 0 &&
                Objects.equals(currentDate, ticket.currentDate) &&
                Objects.equals(currentTime, ticket.currentTime) &&
                Objects.equals(currentMovieTitle, ticket.currentMovieTitle) &&
                Objects.equals(tempQRUrl, ticket.tempQRUrl);
    }

    @Override
    public int hashCode() {

        return Objects.hash(currentDate, currentTime, currentMovieTitle, currentRow, currentSeat, currentPrice, currentDiscount, tempQRUrl);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "currentDate=" + currentDate +
                ", currentTime=" + currentTime +
                ", currentMovieTitle='" + currentMovieTitle + '\'' +
                ", currentRow=" + currentRow +
                ", currentSeat=" + currentSeat +
                ", currentPrice=" + currentPrice +
                ", currentDiscount=" + currentDiscount +
                ", tempQRUrl='" + tempQRUrl + '\'' +
                '}';
    }
}

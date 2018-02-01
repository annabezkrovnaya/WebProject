package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class TicketDTO extends Entity<Integer> {

    private LocalDate currentDate;
    private LocalTime currentTime;
    private String currentMovieTitle;
    private int currentRow;
    private int currentSeat;
    private double currentPrice;
    private double currentDiscount;
    private String tempQRUrl;

    public TicketDTO() {
    }

    public TicketDTO(LocalDate currentDate, LocalTime currentTime, String currentMovieTitle, int currentRow, int currentSeat, double currentPrice, double currentDiscount, String tempQRUrl) {
        this.currentDate = currentDate;
        this.currentTime = currentTime;
        this.currentMovieTitle = currentMovieTitle;
        this.currentRow = currentRow;
        this.currentSeat = currentSeat;
        this.currentPrice = currentPrice;
        this.currentDiscount = currentDiscount;
        this.tempQRUrl = tempQRUrl;
    }

    public TicketDTO(LocalDate currentDate, LocalTime currentTime, String currentMovieTitle, int currentRow, int currentSeat, double currentPrice) {
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
    public String toString() {
        return "TicketDTO{" +
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

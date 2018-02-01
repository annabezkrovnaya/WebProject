package ua.org.oa.annabezkrovnaya.model;

import java.util.List;
import java.util.Objects;


public class Hall extends Entity<Integer> {

    private String designation;
    private int row;
    private int seat;
    private String format;
    private List<Session> hallSessionList;
    private List<Movie> hallMovieList;
    //private Cinema cinema;

    public Hall(String designation, int row, int seat, String format){
        this.designation = designation;
        this.row = row;
        this.seat = seat;
        this.format = format;
    }

    public Hall() {
    }

    public Hall(String designation, int row, int seat, String format, List<Session> hallSessionList, List<Movie> hallMovieList) {
        this.designation = designation;
        this.row = row;
        this.seat = seat;
        this.format = format;
        this.hallSessionList = hallSessionList;
        this.hallMovieList = hallMovieList;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Session> getHallSessionList() {
        return hallSessionList;
    }

    public void setHallSessionList(List<Session> hallSessionList) {
        this.hallSessionList = hallSessionList;
    }

    public List<Movie> getHallMovieList() {
        return hallMovieList;
    }

    public void setHallMovieList(List<Movie> hallMovieList) {
        this.hallMovieList = hallMovieList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hall hall = (Hall) o;
        return row == hall.row &&
                seat == hall.seat &&
                Objects.equals(designation, hall.designation) &&
                Objects.equals(format, hall.format) &&
                Objects.equals(hallSessionList, hall.hallSessionList) &&
                Objects.equals(hallMovieList, hall.hallMovieList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), designation, row, seat, format, hallSessionList, hallMovieList);
    }

    @Override
    public String toString() {
        return "Hall{" +
                "designation='" + designation + '\'' +
                ", row=" + row +
                ", seat=" + seat +
                ", format='" + format + '\'' +
                ", hallSessionList=" + hallSessionList +
                ", hallMovieList=" + hallMovieList +
                '}';
    }
}

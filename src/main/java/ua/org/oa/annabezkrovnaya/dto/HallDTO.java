package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.Entity;
import ua.org.oa.annabezkrovnaya.model.Movie;
import ua.org.oa.annabezkrovnaya.model.Session;

import java.util.List;

public class HallDTO extends Entity<Integer> {

    private String designation;
    private int row;
    private int seat;
    private String format;
    private List<Session> hallSessionList;
    private List<Movie> hallMovieList;

    public HallDTO() {
    }

    public HallDTO(String designation, int row, int seat, String format, List<Session> hallSessionList, List<Movie> hallMovieList) {
        this.designation = designation;
        this.row = row;
        this.seat = seat;
        this.format = format;
        this.hallSessionList = hallSessionList;
        this.hallMovieList = hallMovieList;
    }

    public HallDTO(String designation, int row, int seat, String format) {
        this.designation = designation;
        this.row = row;
        this.seat = seat;
        this.format = format;
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
    public String toString() {
        return "HallDTO{" +
                "designation='" + designation + '\'' +
                ", row=" + row +
                ", seat=" + seat +
                ", format='" + format + '\'' +
                ", hallSessionList=" + hallSessionList +
                ", hallMovieList=" + hallMovieList +
                '}';
    }
}

package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.*;

import java.util.List;
import java.util.Set;

public class CinemaDTO extends Entity<Integer> {

    private String name;
    private String address;
    private String planUrl;
    private Set<Hall> hallSet;
    private List<Movie> movieList;
    private Set<User> userSet;
    private List<Session> sessionList;

    public CinemaDTO() {
    }

    public CinemaDTO(String name, String address, String planUrl) {
        this.name = name;
        this.address = address;
        this.planUrl = planUrl;
    }

    public CinemaDTO(String name, String address, String planUrl, Set<Hall> hallSet, List<Movie> movieList, Set<User> userSet, List<Session> sessionList) {
        this.name = name;
        this.address = address;
        this.planUrl = planUrl;
        this.hallSet = hallSet;
        this.movieList = movieList;
        this.userSet = userSet;
        this.sessionList = sessionList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlanUrl() {
        return planUrl;
    }

    public void setPlanUrl(String planUrl) {
        this.planUrl = planUrl;
    }

    public Set<Hall> getHallSet() {
        return hallSet;
    }

    public void setHallSet(Set<Hall> hallSet) {
        this.hallSet = hallSet;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public String toString() {
        return "CinemaDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", planUrl='" + planUrl + '\'' +
                ", hallSet=" + hallSet +
                ", movieList=" + movieList +
                ", userSet=" + userSet +
                ", sessionList=" + sessionList +
                '}';
    }
}

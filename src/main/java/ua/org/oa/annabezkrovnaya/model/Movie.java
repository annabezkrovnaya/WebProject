package ua.org.oa.annabezkrovnaya.model;

import java.time.LocalDate;
import java.util.Objects;

public class Movie extends Entity<Integer> {

    private String title;
    private String genre;
    private String country;
    private String ageLimit;
    private String format;
    private double duration;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String posterUrl;
    private String trailerUrl;
    private String description;

    public Movie() {
    }

    public Movie(String title, String genre, String country, String ageLimit, String format, double duration,
                 LocalDate startDate, LocalDate finishDate, String posterUrl, String trailerUrl, String description) {
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.ageLimit = ageLimit;
        this.format = format;
        this.duration = duration;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.posterUrl = posterUrl;
        this.trailerUrl = trailerUrl;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", ageLimit='" + ageLimit + '\'' +
                ", format='" + format + '\'' +
                ", duration=" + duration +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", posterUrl='" + posterUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.duration, duration) == 0 &&
                Objects.equals(title, movie.title) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(country, movie.country) &&
                Objects.equals(ageLimit, movie.ageLimit) &&
                Objects.equals(format, movie.format) &&
                Objects.equals(startDate, movie.startDate) &&
                Objects.equals(finishDate, movie.finishDate) &&
                Objects.equals(posterUrl, movie.posterUrl) &&
                Objects.equals(trailerUrl, movie.trailerUrl) &&
                Objects.equals(description, movie.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), title, genre, country, ageLimit, format, duration, startDate,
                finishDate, posterUrl, trailerUrl, description);
    }
}

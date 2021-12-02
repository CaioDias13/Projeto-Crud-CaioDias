package br.com.jlgregorio.springcrud.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "author ", length = 30, nullable = false)
    private String director;

    @Column(name = "year" ,length = 4, nullable = false)
    private String year;

    @Column(name = "cast", length = 50)
    private String cast;

    @Column(name = "genre", length = 20)
    private String genre;

    public Movie() {
    }

    public Movie(long id, String name, String director, String year, String cast, String genre) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
        this.cast = cast;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

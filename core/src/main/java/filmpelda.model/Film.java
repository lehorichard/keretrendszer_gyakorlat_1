package filmpelda.model;

import filmpelda.exeption.DateIsTooLate;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Film {
    private int hossz;
    private String hun_title;
    private String orig_title;
    private List<Actor> actors;
    private Collection<Director> directors;
    private Collection<Genre> genre;
    private LocalDate relase_date;
    private Rating rating;
    private double imdb_score;

    public Film(){

    }

    public Film(int hossz, String hun_title, String orig_title, List<Actor> actors,
                Collection<Director> directors, Collection<Genre> genre,
                LocalDate relase_date, Rating rating, double imdb_score) {
        this.hossz = hossz;
        this.hun_title = hun_title;
        this.orig_title = orig_title;
        this.actors = actors;
        this.directors = directors;
        this.genre = genre;
        this.relase_date = relase_date;
        this.rating = rating;
        this.imdb_score = imdb_score;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) throws InvalidValue {
        if(hossz<1){
            throw new InvalidValue();
        }
        this.hossz = hossz;
    }

    public String getHun_title() {
        return hun_title;
    }

    public void setHun_title(String hun_title) {
        this.hun_title = hun_title;
    }

    public String getOrig_title() {
        return orig_title;
    }

    public void setOrig_title(String orig_title) {
        this.orig_title = orig_title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Collection<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Collection<Director> directors) {
        this.directors = directors;
    }

    public Collection<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Collection<Genre> genre) {
        this.genre = genre;
    }

    public LocalDate getRelase_date() {
        return relase_date;
    }

    public void setRelase_date(LocalDate relase_date) throws DateIsTooLate {
        if(relase_date.isBefore(LocalDate.now().plusMonths(3))){
            throw new DateIsTooLate(relase_date.toString());
        }
        this.relase_date = relase_date;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public double getImdb_score() {
        return imdb_score;
    }

    public void setImdb_score(double imdb_score) throws InvalidValue {
        if(imdb_score<0 || imdb_score>10){
            throw new InvalidValue();
        }
        this.imdb_score = imdb_score;
    }
}
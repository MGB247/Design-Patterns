package FactoryMethod;

import SingletonPattern.*;

/**
 * Movie
 */
public class Movie implements Watchable, Table {
    private String id;
    private String name;
    private String cover;
    private String thumbnail;
    private String synopsis;
    private String releaseDate;
    private String length;
    private float rating;
    private Trailer[] trailers;
    private Actor[] actors;
    private Producer[] producers;
    private Comment[] comments;
    private Genre[] genres;

    public Movie() {
    }

    public Movie(String id, String name, String cover, String thumbnail, String synopsis, String releaseDate,
            String length, float rating, Trailer[] trailers, Actor[] actors, Producer[] producers, Comment[] comments,
            Genre[] genres) {
        this.id = id;
        this.setName(name);
        this.setCover(cover);
        this.setThumbnail(thumbnail);
        this.setSynopsis(synopsis);
        this.setReleaseDate(releaseDate);
        this.setLength(length);
        this.setRating(rating);
        this.setTrailers(trailers);
        this.setActors(actors);
        this.setProducers(producers);
        this.setComments(comments);
        this.setGenres(genres);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCover() {
        return this.cover;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getSynopsis() {
        return this.synopsis;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public String getLength() {
        return this.length;
    }

    public float getRating() {
        return this.rating;
    }

    public Trailer[] getTrailers() {
        return this.trailers;
    }

    public Actor[] getActors() {
        return this.actors;
    }

    public Producer[] getProducers() {
        return this.producers;
    }

    public Comment[] getComments() {
        return this.comments;
    }

    public Genre[] getGenres() {
        return this.genres;
    }

    public boolean setName(String name) {
        if (name.length() > 0) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setCover(String cover) {
        if (cover.length() > 0) {
            this.cover = cover;
            return true;
        }
        return false;
    }

    public boolean setThumbnail(String thumbnail) {
        if (thumbnail.length() > 0) {
            this.thumbnail = thumbnail;
            return true;
        }
        return false;
    }

    public boolean setSynopsis(String synopsis) {
        if (synopsis.length() > 0) {
            this.synopsis = synopsis;
            return true;
        }
        return false;
    }

    public boolean setReleaseDate(String releaseDate) {
        if (releaseDate.length() > 0) {
            this.releaseDate = releaseDate;
            return true;
        }
        return false;
    }

    public boolean setLength(String length) {
        if (length.length() > 0) {
            this.length = length;
            return true;
        }
        return false;
    }

    public boolean setRating(float rating) {
        if (rating > -1 && rating < 11) {
            this.rating = rating;
            return true;
        }
        return false;
    }

    public boolean setTrailers(Trailer[] trailers) {
        this.trailers = trailers;
        return true;
    }

    public boolean setActors(Actor[] actors) {
        this.actors = actors;
        return true;
    }

    public boolean setProducers(Producer[] producers) {
        this.producers = producers;
        return true;
    }

    public boolean setComments(Comment[] comments) {
        this.comments = comments;
        return true;
    }

    public boolean setGenres(Genre[] genres) {
        this.genres = genres;
        return true;
    }

    public boolean setData(String id, String name, String cover, String thumbnail, String synopsis, String releaseDate,
            String length, float rating, Trailer[] trailers, Actor[] actors, Producer[] producers, Comment[] comments,
            Genre[] genres) {
        if (this.setName(name) && this.setCover(cover) && this.setThumbnail(thumbnail) && this.setSynopsis(synopsis)
                && this.setReleaseDate(releaseDate) && this.setLength(length) && this.setRating(rating)
                && this.setTrailers(trailers) && this.setActors(actors) && this.setProducers(producers)
                && this.setComments(comments) && this.setGenres(genres)) {
            this.id = id;
            return true;
        }
        return false;

    }

    public boolean save() {
        if (Database.getInstance().executeQuery("Saving Movie to Database"))
            return true;
        return false;

    }

    public boolean delete() {
        if (Database.getInstance().executeQuery("Deleting Movie from Database"))
            return true;
        return false;
    }

    public boolean update() {
        if (Database.getInstance().executeQuery("Updating Movie In Database"))
            return true;
        return false;
    }
}
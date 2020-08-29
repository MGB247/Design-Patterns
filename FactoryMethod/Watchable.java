package FactoryMethod;

/**
 * Watchable
 */
public interface Watchable {

    public String getId();

    public String getName();

    public String getCover();

    public String getThumbnail();

    public String getSynopsis();

    public String getReleaseDate();

    public String getLength();

    public float getRating();

    public Trailer[] getTrailers();

    public Actor[] getActors();

    public Producer[] getProducers();

    public Comment[] getComments();

    public Genre[] getGenres();

    public boolean setName(String name);

    public boolean setCover(String cover);

    public boolean setThumbnail(String thumbnail);

    public boolean setSynopsis(String synopsis);

    public boolean setReleaseDate(String releaseDate);

    public boolean setLength(String length);

    public boolean setRating(float rating);

    public boolean setTrailers(Trailer[] trailers);

    public boolean setActors(Actor[] actors);

    public boolean setProducers(Producer[] producers);

    public boolean setComments(Comment[] comments);

    public boolean setGenres(Genre[] genres);

    public boolean setData(String id, String name, String cover, String thumbnail, String synopsis, String releaseDate,
            String length, float rating, Trailer[] trailers, Actor[] actors, Producer[] producers, Comment[] comments,
            Genre[] genres);
}
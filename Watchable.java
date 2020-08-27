/**
 * Watchable
 */
public interface Watchable {
    public String getName();

    public String getCover();

    public String getThumbnail();

    public String getSynopsis();

    public String getReleaseDate();

    public String getLength();

    public float getRating();

    public String[] getTrailers();

    public String[] getActors();

    public String[] getProducers();

    public String[] getComments();

    public String[] getGenres();

    public boolean setName(String name);

    public boolean setCover(String cover);

    public boolean setThumbnail(String thumbnail);

    public boolean setSynopsis(String synopsis);

    public boolean setReleaseDate(String releaseDate);

    public boolean setLength(String length);

    public boolean setRating(float rating);

    public boolean setTrailers(String[] trailers);

    public boolean setActors(String[] actors);

    public boolean setProducers(String[] producers);

    public boolean setComments(String[] comments);

    public boolean setGenres(String[] genres);

    public boolean setData(String name, String cover, String thumbnail, String synopsis, String releaseDate,
            String length, float rating);

    public boolean saveToDatabase();

    public boolean deleteFromDatabase();
}
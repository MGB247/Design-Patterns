import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Use Facade for Complex GUI Library i.e. Facade Pattern

        GUIFacade guiFacade = new GUIFacade();
        guiFacade.initializeGUI();

        // End Facade Patter Code

        // Factory Method Code

        MovieCreator movieCreator = new MovieCreator();
        TvSeriesCreator tvSeriesCreator = new TvSeriesCreator();

        Watchable movie = movieCreator.createWatchable();
        movie.setData("1", "Harry Potter", "Cover URL", "Thumbnail URL", "This movie is about...", "29 Sept, 2004",
                "120 minutes", (float) 8.5,
                new Trailer[] { new Trailer("1", "Harry Potter Preview Trailer", "youtube.com/path", "mp4"),
                        new Trailer("2", "Harry Potter Final Trailer", "youtube.com/path", "mp4") },
                new Actor[] { new Actor("1", "Daniel Radcliffe", "30"), new Actor("2", "Actor 2", "25") },
                new Producer[] { new Producer("1", "Producer", "25") },
                new Comment[] { new Comment("1", "Great movie", "6th Oct, 2004", "Ghayas Baig"),
                        new Comment("2", "nice...", "7th Oct, 2004", "Hameez") },
                new Genre[] { new Genre("1", "Action"), new Genre("2", "Adventure"), new Genre("3", "Fantasy") });

        Watchable tvSeries = tvSeriesCreator.createWatchable();
        tvSeries.setData("1", "Big Bang Theory", "Cover URL", "Thumbnail URL", "This Tv Series is about...",
                "9 Aug, 2001", "46 minutes avg.", (float) 9.0,
                new Trailer[] { new Trailer("1", "Big Bang Theory Preview Trailer", "youtube.com/path", "mkv"),
                        new Trailer("2", "Big Bang Theory Final Trailer", "youtube.com/path", "mkv") },
                new Actor[] { new Actor("1", "Actor 1", "20"), new Actor("2", "Actor 2", "27") },
                new Producer[] { new Producer("1", "Producer", "25") },
                new Comment[] { new Comment("1", "Good tv series.", "6th Oct, 2004", "Ghayas Baig"),
                        new Comment("2", "time pass...", "7th Oct, 2004", "Hameez") },
                new Genre[] { new Genre("1", "Science Fiction"), new Genre("2", "Comedey") });

        // End Factory Method Code

        // Create Users

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("1", "Ghayas", "ghayasbaig247@gmail.com", "hashedPassword", "profilePic URL"));
        users.add(new User("2", "Hameez", "hameez@gmail.com", "hashedPassword", "profilePic URL"));
        users.add(new User("3", "Mustafa", "mustafa@gmail.com", "hashedPassword", "profilePic URL"));

        // Subscribe Users to Events i.e. Oberserver Pattern

        EventManager eventManager = new EventManager();
        for (User user : users) {
            eventManager.subscribe("Movie Released", user);
            eventManager.subscribe("Upcoming Movies", user);
            eventManager.subscribe("Upcoming Tv Series", user);
        }

        eventManager.notifyListeners("Movie Released", "\nSpiderman Homecoming has been released.\n");
        eventManager.notifyListeners("Upcoming Movies",
                "\nSome upcoming Movies are:\n1." + movie.getName() + " (" + movie.getReleaseDate() + ")\n");
        eventManager.notifyListeners("Upcoming Tv Series",
                "\nSome upcoming Tv Series are:\n1." + tvSeries.getName() + " (" + tvSeries.getReleaseDate() + ")\n");

        // End Observer Pattern Code

        // Strategy Pattern Code

        VideoRenderStrategyContext videoRenderStrategyContext = new VideoRenderStrategyContext();
        videoRenderStrategyContext.setStratgey(new MkvVideoRenderStrategy());
        videoRenderStrategyContext.executeStrategy(tvSeries.getTrailers()[0].getName(),
                tvSeries.getTrailers()[0].getLink());

        videoRenderStrategyContext.setStratgey(new Mp4VideoRenderStrategy());
        videoRenderStrategyContext.executeStrategy(movie.getTrailers()[0].getName(), movie.getTrailers()[0].getLink());
    }
}
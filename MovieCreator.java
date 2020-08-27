public class MovieCreator extends WatchableCreator {
    public Watchable createWatchable() {
        return new Movie();
    }
}
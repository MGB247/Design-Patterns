package FactoryMethod;

public class TvSeriesCreator extends WatchableCreator {
    public Watchable createWatchable() {
        return new TvSeries();
    }
}
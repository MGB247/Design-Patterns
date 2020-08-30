package FactoryMethod;

public class EpisodeCreator {
    public Watchable createWatchable() {
        return new Episode();
    }
}
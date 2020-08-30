package StrategyPattern;

public class RenderTrailer {
    private VideoRenderStrategy videoRenderStrategy;

    public void setStratgey(VideoRenderStrategy videoRenderStrategy) {
        this.videoRenderStrategy = videoRenderStrategy;
    }

    public void executeStrategy(String name, String path) {
        this.videoRenderStrategy.renderVideo(name, path);
    }
}
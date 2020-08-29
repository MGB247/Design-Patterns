package StrategyPattern;

public class Mp4VideoRenderStrategy implements VideoRenderStrategy {
    public void renderVideo(String name, String path) {
        System.out.println("Rendering " + name + " at " + path + " in Mp4");
    }
}
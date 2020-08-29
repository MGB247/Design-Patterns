public class MkvVideoRenderStrategy implements VideoRenderStrategy {
    public void renderVideo(String name, String path) {
        System.out.println("Rendering " + name + " at " + path + " in Mkv");
    }
}
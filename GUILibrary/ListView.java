package GUILibrary;

public class ListView implements GUIElement {

    public ListView() {
        System.out.println("Creating a ListView");
    }

    public void render() {
        System.out.println("Rendering ListView");
    }

    public void onScroll() {
        System.out.println("Scrolled");
    }
}
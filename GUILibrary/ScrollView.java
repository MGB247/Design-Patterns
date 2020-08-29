package GUILibrary;

public class ScrollView implements GUIElement {
    public ScrollView() {
        System.out.println("Creating a ScrollView");
    }

    public void render() {
        System.out.println("Rendering ScrollView");
    }

    public void onScroll() {
        System.out.println("Scrolled");
    }
}
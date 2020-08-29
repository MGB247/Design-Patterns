package GUILibrary;

public class Button implements GUIElement {

    public Button() {
        System.out.println("Creating a Button");
    }

    public void render() {
        System.out.println("Rendering Button");
    }

    public void onClick() {
        System.out.println("Clicked");
    }
}
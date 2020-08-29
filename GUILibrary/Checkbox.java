package GUILibrary;

public class Checkbox implements GUIElement {

    public Checkbox() {
        System.out.println("Creating a Checkbox");
    }

    public void render() {
        System.out.println("Rendering Checkbox");
    }

    public void onClick() {
        System.out.println("Clicked");
    }
}
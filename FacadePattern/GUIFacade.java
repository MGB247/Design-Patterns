package FacadePattern;

import GUILibrary.*;

public class GUIFacade {
    public boolean initializeNavbar() {

        System.out.println("Initializing Navbar Window.");

        GUIElement window = new Window();
        window.render();

        ListView listView = new ListView();
        listView.render();

        GUIElement button = new Button();
        button.render();

        return true;
    }

    public boolean initializeSidebar() {

        System.out.println("Initializing Sidebar Window.");

        GUIElement window = new Window();
        window.render();

        ScrollView ScrollView = new ScrollView();
        ScrollView.render();

        GUIElement button = new Button();
        button.render();

        Checkbox checkbox = new Checkbox();
        checkbox.render();

        return true;
    }

    public boolean initializeMainContent() {

        System.out.println("Initializing Main Content Window.");

        GUIElement window = new Window();
        window.render();

        ScrollView ScrollView = new ScrollView();
        ScrollView.render();

        GUIElement button = new Button();
        button.render();

        Checkbox checkbox = new Checkbox();
        checkbox.render();

        return true;
    }
}
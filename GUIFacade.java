import GUILibrary.*;

public class GUIFacade {
    public boolean initializeGUI() {

        GUIElement window = new Window();
        window.render();

        GUIElement button = new Button();
        button.render();

        Checkbox checkbox = new Checkbox();
        checkbox.render();

        ListView listView = new ListView();
        listView.render();

        ScrollView ScrollView = new ScrollView();
        ScrollView.render();

        return true;
    }
}
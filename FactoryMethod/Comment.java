package FactoryMethod;

import SingletonPattern.*;

public class Comment implements Table {
    private String id;
    private String text;
    private String date;
    private String by;

    public Comment(String id, String text, String date, String by) {
        this.setId(id);
        this.setText(text);
        this.setDate(date);
        this.setBy(by);
    }

    public String getId() {
        return this.id;
    }

    public String gettext() {
        return this.text;
    }

    public String getdate() {
        return this.date;
    }

    public String getBy() {
        return this.by;
    }

    public boolean setId(String id) {
        if (id.length() > 0) {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setText(String text) {
        if (text.length() > 0) {
            this.text = text;
            return true;
        }
        return false;
    }

    public boolean setDate(String date) {
        if (date.length() > 0) {
            this.date = date;
            return true;
        }
        return false;
    }

    public boolean setBy(String by) {
        if (by.length() > 0) {
            this.by = by;
            return true;
        }
        return false;
    }

    public boolean save() {
        if (Database.getInstance().executeQuery("Saving Comment to Database"))
            return true;
        return false;

    }

    public boolean delete() {
        if (Database.getInstance().executeQuery("Deleting Comment from Database"))
            return true;
        return false;
    }

    public boolean update() {
        if (Database.getInstance().executeQuery("Updating Comment In Database"))
            return true;
        return false;
    }

    public boolean create() {
        if (Database.getInstance().executeQuery("Creating Comment In Database"))
            return true;
        return false;
    }
}
package FactoryMethod;

import SingletonPattern.*;

public class Genre implements Table {
    private String id;
    private String name;

    public Genre(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public String getId() {
        return this.id;
    }

    public String getname() {
        return this.name;
    }

    public boolean setId(String id) {
        if (id.length() > 0) {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setName(String name) {
        if (name.length() > 0) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean save() {
        if (Database.getInstance().executeQuery("Saving Genre to Database"))
            return true;
        return false;

    }

    public boolean delete() {
        if (Database.getInstance().executeQuery("Deleting Genre from Database"))
            return true;
        return false;
    }

    public boolean update() {
        if (Database.getInstance().executeQuery("Updating Genre In Database"))
            return true;
        return false;
    }

    public boolean create() {
        if (Database.getInstance().executeQuery("Creating Genre In Database"))
            return true;
        return false;
    }
}
package FactoryMethod;

import SingletonPattern.*;

public class Producer implements Table {
    private String id;
    private String name;
    private String age;

    public Producer(String id, String name, String age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getage() {
        return this.age;
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

    public boolean setAge(String age) {
        if (age.length() > 0) {
            this.age = age;
            return true;
        }
        return false;
    }

    public boolean save() {
        if (Database.getInstance().executeQuery("Saving Producer to Database"))
            return true;
        return false;

    }

    public boolean delete() {
        if (Database.getInstance().executeQuery("Deleting Producer from Database"))
            return true;
        return false;
    }

    public boolean update() {
        if (Database.getInstance().executeQuery("Updating Producer In Database"))
            return true;
        return false;
    }
}
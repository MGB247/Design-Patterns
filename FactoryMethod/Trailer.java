package FactoryMethod;

import SingletonPattern.*;

public class Trailer implements Table {
    private String id;
    private String name;
    private String link;
    private String format;
    private String watchableId;

    public Trailer(String id, String name, String link, String format, String watchableId) {
        this.setId(id);
        this.setName(name);
        this.setLink(link);
        this.setFormat(format);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLink() {
        return this.link;
    }

    public String getFormat() {
        return this.format;
    }

    public String getWatchableId() {
        return this.watchableId;
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

    public boolean setLink(String link) {
        if (link.length() > 0) {
            this.link = link;
            return true;
        }
        return false;
    }

    public boolean setFormat(String format) {
        if (format.length() > 0) {
            this.format = format;
            return true;
        }
        return false;
    }

    public boolean setWatchableId(String watchableId) {
        if (watchableId.length() > 0) {
            this.watchableId = watchableId;
            return true;
        }
        return false;
    }

    public boolean save() {
        if (Database.getInstance().executeQuery("Saving Trailer to Database"))
            return true;
        return false;

    }

    public boolean delete() {
        if (Database.getInstance().executeQuery("Deleting Trailer from Database"))
            return true;
        return false;
    }

    public boolean update() {
        if (Database.getInstance().executeQuery("Updating Trailer In Database"))
            return true;
        return false;
    }
}
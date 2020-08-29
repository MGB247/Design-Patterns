public class Trailer {
    private String id;
    private String name;
    private String link;
    private String format;

    public Trailer(String id, String name, String link, String format) {
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
}
public class Genre {
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
}
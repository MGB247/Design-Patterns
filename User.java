public class User implements EventListener {
    private String id;
    private String name;
    private String email;
    private String password;
    private String profilePicture;

    public User(String id, String name, String email, String password, String profilePicture) {
        this.id = id;
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setProfilePicture(profilePicture);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProfilePicture() {
        return this.profilePicture;
    }

    public boolean setName(String name) {
        if (name.length() > 0) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setEmail(String email) {
        if (email.length() > 0) {
            this.email = email;
            return true;
        }
        return false;
    }

    public boolean setPassword(String password) {
        if (password.length() > 0) {
            this.password = password;
            return true;
        }
        return false;
    }

    public boolean setProfilePicture(String profilePicture) {
        if (profilePicture.length() > 0) {
            this.profilePicture = profilePicture;
            return true;
        }
        return false;
    }

    public void update(String event, String message) {
        System.out.println(event);
        System.out.println(message);
    }
}
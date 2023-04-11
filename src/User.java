
public class User {
    private String firstname;
    private String lastName;
    private int age;
    private String profession;
    private String origin;

    public User(String firstname, String lastName, int age, String profession, String origin) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.origin = origin;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public String getOrigin() {
        return origin;
    }
}

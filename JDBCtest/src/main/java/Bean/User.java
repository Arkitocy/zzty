package Bean;

public class User {
    private int id;
    private String name;
    private String pwd;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User( String name, String pwd, int age) {
        this.setName(name);
        this.setPwd(pwd);
        this.setAge(age);

    }


    public User(int id, String name, String pwd) {
        this.setId(id);
        this.setName(name);
        this.setPwd(pwd);
    }

    public void showInfo() {
        System.out.println("ID:" + this.getId() + " Name:" + this.getName() + " Password:" + this.getPwd());
    }

}

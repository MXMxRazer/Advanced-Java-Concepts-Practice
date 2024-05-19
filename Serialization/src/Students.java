import java.io.Serializable;

public class Students implements Serializable {

    private static final long serailVersionUID = 1L;

    private String name;
    private int age;

    private transient int privateVariableNotSeen = 2;

    public int getPrivateVariableNotSeen() {
        return privateVariableNotSeen;
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

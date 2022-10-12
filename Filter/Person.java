package Filter;

public class Person {
    private String name;
    private String  Gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        Gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

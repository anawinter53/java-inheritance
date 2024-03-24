import person.*;

public class PersonTester {
    public static void main(String[] args) {
        Person p = new Person("Grace", "Lee");
        Student s = new Student("Jeffrey", "Long", 2021);
        Teacher t = new Teacher("Brian", "Repass", "Computer Science");

        System.out.println(p.getName());
        System.out.println(s);
        System.out.println(t);
    }
}

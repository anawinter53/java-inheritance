package person;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getGreeting() {
        return "Hi, I'm " + firstName;
    }

    //setters and getters
    public void setName(String firstNameIn, String lastNameIn) {
        firstName = firstNameIn;
        lastName = lastNameIn;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}

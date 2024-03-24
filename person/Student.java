package person;

public class Student extends Person{
    private int yearOfGraduation;
    
    public Student(String firstName, String lastName, int yearOfGraduation) {
        super(firstName, lastName);
        this.yearOfGraduation = yearOfGraduation;
    }

    public String toString() {
        return "Student: " + firstName + " " + lastName + " - " + yearOfGraduation;
    }

    //setters and getters
    public void setYearOfGraduation(int yearOfGraduationIn) {
        yearOfGraduation = yearOfGraduationIn;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }
}

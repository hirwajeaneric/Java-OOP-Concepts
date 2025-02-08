package models;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private double gpa;
    private int totalCredits;
    private boolean isEligibleForGraduation;

    public Student(String fName, String lName, String email, String password, double gpa, int totalCredits) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
        this.password = password;
        this.gpa = gpa;
        this.totalCredits = totalCredits;
        this.isEligibleForGraduation = false;
    }

    public String setGpa(double gpa) {
        if (gpa > 5) {
            return "Invalid gpa value";
        }
        this.gpa = gpa;
        return "GPA changed to "+gpa;
    }

    public String getString() {
        return firstName + " " + lastName + " " + email + " " + password + " " + gpa + " " + totalCredits;
    }
}

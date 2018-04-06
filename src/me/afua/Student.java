package me.afua;

import java.util.ArrayList;

public class Student {

    //Set up attributes of the student class
    private String studentNumber;
    private String firstName;
    private String lastName;

    //What's this? An arraylist of courses that the student is taking!
    private ArrayList<Course> courses;


    //Overloaded constructor used.
    public Student(String studentNumber, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //LOOK! A method to add INDIVIDUAL courses. Remember ArrayLists? We're using them again.
    public void takes(Course course)
    {
        this.courses.add(course);

    }

    //Get a list of all courses the student is taking.
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //Allows us to add more than one course at a time
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}

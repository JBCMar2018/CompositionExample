package me.afua;

public class Course {
    //Course is set up with title and room number
    private String courseTitle;
    private String roomNumber;

    //Overloaded constructor used. Did not add the default constructor for the Web. 
    public Course(String courseTitle, String roomNumber) {
        this.courseTitle = courseTitle;
        this.roomNumber = roomNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

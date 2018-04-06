package me.afua;

public class Course {
    private String courseTitle;
    private String roomNumber;


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

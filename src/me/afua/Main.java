package me.afua;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Set variables
        Course course;
        Student student;
        ArrayList<Student> students = new ArrayList<>();

	    //Set courses
        Course algebra = new Course("Algebra","MT 203");
        Course calculus = new Course("Calculus","MT 204");

        //Set students
        Student Amanda = new Student("001","Amanda","Ames");
        students.add(Amanda);
        Student Billy = new Student("002","Billy","Bryant");
        students.add(Billy);

        Billy.takes(algebra);
        Amanda.takes(algebra);
        Amanda.takes(calculus);

        for(Student eachStudent:students)
        {
            System.out.println(eachStudent.getFirstName()+" "+eachStudent.getLastName()+"'s courses:");
            for(Course eachCourse:eachStudent.getCourses())
            {
                System.out.println("\t"+eachCourse.getCourseTitle()+" in "+eachCourse.getRoomNumber());
            }
        }



    }
}

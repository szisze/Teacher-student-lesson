package application;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    List<String> course = new ArrayList<>();
    int index = 0;

    public Teacher(String setName, String setAddress) {
        setName(setName);
        setAddress(setAddress);
    }

    public void addCourse(String courseName) {

        if (index < 5) {
            course.add(courseName);
            index = index + 1;
        } else {
            System.out.println(getName() + "you can't teach more than 5 courses concurrently");
        }
    }

    public void removeCourse(List<String> course, String courseName) {
        course.remove(courseName);
    }


    public void setCourse() {

    }
}

package application;

import java.util.ArrayList;

import java.util.List;

public class Students extends Person {
    List<String> courses = new ArrayList<>();
    List<Double> grades = new ArrayList<>();


    public Students(String setName, String setAddress) {
        setName(setName);
        setAddress(setAddress);
    }


    public void addCourseGrade(String course, double grade) {
        int index = 0;
        if(index < 30) {
            courses.add(course);
            grades.add(grade);
        }
        else{
            System.out.println("Sorry, you can't take more than 30 courses");
        }

    }

    public double getAverageGrade() {
        double count = 0;
        int index = 0;


        for (int i = 0; i < grades.size(); i++) {
            count = count + grades.get(index);
            index = index + 1;
        }

        return (count / index);

    }


}

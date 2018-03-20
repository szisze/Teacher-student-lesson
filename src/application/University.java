package application;

public class University {

    public static void main(String[] args)
    {
        Students endre = new Students("Endre","Budapest, Kossuth Lajos 10");
        Teacher zoltan  = new Teacher("Zoltan","Budapest, Barros utca 10");

        zoltan.addCourse("Informatika");
        zoltan.addCourse("Adatbazis");

        endre.addCourseGrade("Informatika", 5);
        endre.addCourseGrade("Adatbazis",10);
        System.out.println(endre.getAverageGrade());

    }


}

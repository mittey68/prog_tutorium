package Termin6.Musterklausur.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class ExamTask02 { // 0,5

    public static void main(String[] args) { // 0,5

        List<Lecture> lectures = new ArrayList<>(); // 0,5
        lectures.add(new Lecture("Mathe", 5)); // 0,5
        lectures.add(new Lecture("Programmierung", 10)); // 0,5

        // Vorher: 
        // Class class1 = new Class("WWIBE122", CourseOfStudies.WI, lectures); // 0,5
        Class class1 = new Class("WWIBE122", CourseOfStudies.WI); // 0,5
        class1.addStudent(new Student("8271625", "Hans Maier")); // 0,5
        class1.addStudent(new Student("9102934", "Peter Müller")); // 0,5

        System.out.println(class1.toString()); // 0,5
        System.out.println(class1.getLectureWithMostCreditPoints()); // 0,5

    }

}

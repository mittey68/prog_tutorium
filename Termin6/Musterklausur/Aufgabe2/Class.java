package Termin6.Musterklausur.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Class { // 0,5

    private final String description; // 0,25
    private final CourseOfStudies courseOfStudies; // 0,25
    private final List<Lecture> lectures; // 0,25
    private final List<Student> students; // 0,25

    /*
     * Vorher:
     * public Class(String description, CourseOfStudies courseOfStudies) { // 0,5
     * this.description = description; // 0,25
     * this.courseOfStudies = courseOfStudies; // 0,25
     * this.lectures = lectures; // 0,25
     * lectures = new ArrayList<>(); // 0,25
     * students = new ArrayList<>(); // 0,25
     * }
     */

    public Class(String description, CourseOfStudies courseOfStudies) { // 0,5
        this.description = description; // 0,25
        this.courseOfStudies = courseOfStudies; // 0,25
        lectures = new ArrayList<>(); // 0,25
        students = new ArrayList<>(); // 0,25
    }

    public String description() { // 0,5
        return description; // 0,5
    }

    public CourseOfStudies courseOfStudies() { // 0,5
        return courseOfStudies; // 0,5
    }

    public List<Lecture> lectures() { // 0,5
        return lectures; // 0,5
    }

    public List<Student> students() { // 0,5
        return students; // 0,5
    }

    public void addLecture(Lecture lecture) { // 0,5
        lectures.add(lecture); // 0,5
    }

    public void addStudent(Student student) { // 0,5
        students.add(student); // 0,5
    }

    public Lecture getLectureWithMostCreditPoints() { // 0,5
        Lecture lecture = lectures.get(0); // 0,5
        int creditPoints = lecture.creditPoints(); // 0,5
        for (int i = 0; i < lectures.size(); i++) { // 0,5
            if (lectures.get(i).creditPoints() > creditPoints) { // 1
                lecture = lectures.get(i); // 0,5
                creditPoints = lecture.creditPoints(); // 0,5
            }
        }
        return lecture; // 0,5
    }

    public String toString() { // 0,5
        return "Class [description=" + description + ", courseOfStudies=" + courseOfStudies.description()
                + ", lectures=" + lectures + ", students=" + students + "]"; // 1
    }

}

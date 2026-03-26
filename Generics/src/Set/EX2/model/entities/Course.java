package Set.EX2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Course{
    private String courseName;
    private List<Student> studentsInCourse = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentsInCourse() {
        return studentsInCourse;
    }

    public void addStudent(Student student){
        this.studentsInCourse.add(student);
    }

}

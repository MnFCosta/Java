package Set.EX2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Course> courseList = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course){
        this.courseList.add(course);
    }
}

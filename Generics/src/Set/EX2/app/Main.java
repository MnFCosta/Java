package Set.EX2.app;

import Set.EX2.model.entities.Course;
import Set.EX2.model.entities.Student;
import Set.EX2.model.entities.Teacher;

import java.util.*;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Teacher teacher = new Teacher("Alex");

        teacher.addCourse(new Course("A"));
        teacher.addCourse(new Course("B"));
        teacher.addCourse(new Course("C"));

        List<Course> courseList = teacher.getCourseList();

        for (Course course : courseList) {
            System.out.printf("How many students in course %s?: ", course.getCourseName());
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("Student #%d ID: ", i + 1);
                int id = sc.nextInt();
                course.addStudent(new Student(id));
            }
        }

        Set<Student> set = new HashSet<>();

        for (Course course : courseList) {
            set.addAll(course.getStudentsInCourse());
        }

        System.out.printf("%nTotal students for teacher %s: %d", teacher.getName(), set.size());

        sc.close();


    }
}

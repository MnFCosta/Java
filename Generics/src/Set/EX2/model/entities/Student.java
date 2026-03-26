package Set.EX2.model.entities;

public class Student {
    private int studentID;

    public Student(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}

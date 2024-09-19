import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String title;
    private ArrayList<Student> enrolledStudents;
    private String instructor;
    private Double courseCredits; //no gets/sets for this

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "instructor='" + instructor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getInstructor() {
        return instructor;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    private void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}

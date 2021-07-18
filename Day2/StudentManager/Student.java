package JavaLabCucManh.Day2.StudentManager;

import java.io.Serializable;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String semester;
    private String courseName;


    public Student(String id, String name, String semester, String courseName) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int compareTo(Student student) {
        return (this.getId().compareToIgnoreCase(student.getId()) < 0 ? -1 :
                (this.getName() == student.getName() ? 0 : 1));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

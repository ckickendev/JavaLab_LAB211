package DSC.Final_Practical_Exam;

public class Employee implements Comparable<Employee>{
    private String id;
    private String name;
    private int Level;

    public Employee(String id, String name, int level) {
        this.id = id;
        this.name = name;
        Level = level;
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

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Level=" + Level +
                '}';
    }
}

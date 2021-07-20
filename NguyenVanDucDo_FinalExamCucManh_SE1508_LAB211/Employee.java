package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

public class Employee {
    private String id;
    private String name;
    private String birth;
    private String email;
    private float coefficientSalary;
    private int employType;

    public Employee() {
    }

    public Employee(String id, String name, String birth, String email, float coefficientSalary, int employType) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.coefficientSalary = coefficientSalary;
        this.employType = employType;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(float coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    public int getEmployType() {
        return employType;
    }

    public void setEmployType(int employType) {
        this.employType = employType;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", email='" + email + '\'' +
                ", coefficientSalary=" + coefficientSalary +
                ", employType=" + employType
                ;
    }
}

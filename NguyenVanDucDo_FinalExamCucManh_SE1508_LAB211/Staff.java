package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

public class Staff extends Employee{
    private String department;

    public Staff(String department) {
        this.department = department;
    }

    public Staff(String id, String name, String birth, String email, float coefficientSalary, int employType, String department) {
        super(id, name, birth, email, coefficientSalary, employType);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "department='" + department + '\'' +
                '}';
    }
}

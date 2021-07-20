package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

public class Manager extends Employee{
    private float positionCoefficient;

    public Manager(float positionCoefficient) {
        this.positionCoefficient = positionCoefficient;
    }

    public Manager(String id, String name, String birth, String email, float coefficientSalary, int employType, float positionCoefficient) {
        super(id, name, birth, email, coefficientSalary, employType);
        this.positionCoefficient = positionCoefficient;
    }

    public float getPositionCoefficient() {
        return positionCoefficient;
    }

    public void setPositionCoefficient(float positionCoefficient) {
        this.positionCoefficient = positionCoefficient;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                "positionCoefficient=" + positionCoefficient +
                '}';
    }
}

package JavaLabCucManh.Day3.Candidate.Model;

public class InternCandidate extends Candidate {
    private String Majors;
    private String Semester;
    private String UniversityName;

    public InternCandidate(String candidateId, String firstName, String lastName, int birthDay, String address,
                           String phone, String email, int candidateType, String majors, String semester,
                           String universityName) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType);
        Majors = majors;
        Semester = semester;
        UniversityName = universityName;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    @Override
    public String toString() {
        return "InternCandidate{" +super.toString()+
                '}';
    }
}

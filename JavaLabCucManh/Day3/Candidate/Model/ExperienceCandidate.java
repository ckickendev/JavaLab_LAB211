package JavaLabCucManh.Day3.Candidate.Model;

public class ExperienceCandidate extends Candidate{
    private int ExpInYear;
    private String ProSkill;

    public ExperienceCandidate(String candidateId, String firstName, String lastName, int birthDay, String address,
                               String phone, String email, int candidateType, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }



    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    @Override
    public String toString() {
        return "ExperienceCandidate{" +super.toString() +
                '}';
    }
}

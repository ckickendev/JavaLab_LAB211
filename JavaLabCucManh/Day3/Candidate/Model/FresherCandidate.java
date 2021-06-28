package JavaLabCucManh.Day3.Candidate.Model;

import java.util.Date;

public class FresherCandidate extends Candidate{
    private Date Graduation_date;
    private String Graduation_rank;
    private String Education;

    public FresherCandidate(String candidateId, String firstName, String lastName, int birthDay, String address,
                            String phone, String email, int candidateType, Date graduation_date, String graduation_rank,
                            String education) {
        super(candidateId, firstName, lastName, birthDay, address, phone, email, candidateType);
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    public Date getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(Date graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" + super.toString() +
                '}';
    }
}

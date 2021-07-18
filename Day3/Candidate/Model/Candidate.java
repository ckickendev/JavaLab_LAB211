package JavaLabCucManh.Day3.Candidate.Model;


public class Candidate {
    private String CandidateId;
    private String FirstName;
    private String LastName;
    private int BirthDay;
    private String address;
    private String phone;
    private String email;
    private int CandidateType;

    public Candidate(String candidateId, String firstName, String lastName, int birthDay, String address,
                     String phone, String email, int candidateType) {
        CandidateId = candidateId;
        FirstName = firstName;
        LastName = lastName;
        BirthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
        CandidateType = candidateType;
    }

    public String getCandidateId() {
        return CandidateId;
    }

    public void setCandidateId(String candidateId) {
        CandidateId = candidateId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(int birthDay) {
        BirthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return CandidateType;
    }

    public void setCandidateType(int candidateType) {
        CandidateType = candidateType;
    }

    @Override
    public String toString() {
        return  "CandidateId='" + CandidateId + '\'' +
                ", Name='" + FirstName
                + " " + LastName + '\''+
                ", address='" + address + '\'' +
                ", CandidateType=" + CandidateType
                ;
    }
}

package JavaLabCucManh.Day5.BaiSo3;

public class Contact {
    public static int ID=1;
    private int id;
    private String fullName;
    private String group;
    private String phone;
    private String address;
    private String lastName;
    private String firstName;

    public Contact(int id ,String group, String phone, String lastName, String firstName, String address) {
        this.group = group;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        this.fullName = firstName + " " + lastName;
        return fullName;
    }

    public void setFullName() {
        this.fullName = firstName + " " + lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", group='" + group + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

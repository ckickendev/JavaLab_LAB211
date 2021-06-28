package JavaLabCucManh.Day6.Person;

public class Person implements Comparable<Person> {

    public String name;
    public String address;
    public double salary;

    public Person() {
    }

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Person x) {
        if (this.getSalary() > x.getSalary()) {
            return 1;
        } else if (this.getSalary() < x.getSalary()) {
            return -1;
        } else  {
            return 0;
        }
    }
}

package JavaLabCucManh.Day6.Worker;

public class Worker implements Comparable<Worker>{
    private String code;
    private String name;
    private int age;
    private int salary;
    private String workLocation;

    public Worker(String code, String name, int age, int salary, String workLocation) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    @Override
    public int compareTo(Worker worker) {
        return (this.getCode().compareToIgnoreCase(worker.getCode()) < 0 ? -1 :
                (this.getName() == this.getName() ? 0 : 1));
    }

}

package JavaLabCucManh.Day2.StudentManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Validation validation = new Validation();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void createStudent(){
        System.out.println("Create student: ");
        System.out.print("Enter id: ");
        String id = validation.checkInputString();
        System.out.print("Enter name: ");
        String name = validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = validation.checkInputString();
        System.out.print("Please enter code name: (1: Java), (2: .Net), (3: C/C++)");
        Integer courseInt = validation.checkInputIntLimit(1,3);
        String course = "";
        switch (courseInt){
            case 1:{
                course = "Java";
                break;
            }
            case 2:{
                course = ".Net";
                break;
            }
            case 3:{
                course = "C/C++";
                break;
            }
        }
        Student student = new Student(id, name, semester, course);
        students.add(student);
        System.out.println("Created success!");
        display();
    }

    public void find(){
        if(students.isEmpty()){
            System.out.println("This list is empty");
        }
        System.out.println("Enter id to find: ");
        String id = validation.checkInputString();
        int index = validation.checkIdExist(students, id);
        if(index == -1){
            System.out.println("Not exist");
        }else {
            System.out.println("This is exist at index: " +index);
        }
    }

    public void sort(){
        System.out.println("Sort success!");
        System.out.println("List student: ");
        Collections.sort(students);
        for(var x: students){
            System.out.println(x);
        }
        display();
    }

    public void update(){
        if (students.isEmpty()) {
            System.out.println("This list is empty!");
            return;
        }

        System.out.print("Enter id: ");

        String code = validation.checkInputString();
        int pos = validation.checkIdExist(students, code);
        while (pos == -1) {
            System.out.println("Not Exist! Enter again");
            code = validation.checkInputString();
            pos = validation.checkIdExist(students, code);
        }
        System.out.print("Enter name: ");
        String name = validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = validation.checkInputString();
        System.out.println("Please enter code name: (1: Java), (2: .Net), (3: C/C++): ");
        Integer courseInt = validation.checkInputIntLimit(1,3);
        String course = "";
        switch (courseInt){
            case 1:{
                course = "Java";
                break;
            }
            case 2:{
                course = ".Net";
                break;
            }
            case 3:{
                course = "C/C++";
                break;
            }
        }
        students.get(pos).setName(name);
        students.get(pos).setSemester(semester);
        students.get(pos).setCourseName(course);
        System.out.println("Update successfully !");
        display();
    }


    public void delete(){
        if (students.isEmpty()) {
            System.out.println("This list is empty !");
            return;
        }
        System.out.println("Enter code to delete: ");
        String code = validation.checkInputString();
        int index = validation.checkIdExist(students, code);
        if(index == -1){
            System.out.println("Not exist");
        }else {
            students.remove(index);
        }
        display();
    }

    public void report(){
        HashMap<Integer, Student> hashmap = new HashMap<Integer, Student>();
        int[] apprear = new int[students.size()];
        for (int i=0; i<students.size(); i++){
            int count=0;
            for (int j=0; j<students.size(); j++){
                if(students.get(i).getCourseName().compareToIgnoreCase(students.get(j).getCourseName())==0 &&
                        students.get(i).getName().compareToIgnoreCase(students.get(j).getName())==0){
                    System.out.println(students.get(i).getCourseName() +"and"+students.get(j).getCourseName());
                    count++;
                    System.out.println(count);
                }
            }
            apprear[i] = count;
        }
        for(int i=0; i<apprear.length; i++){
            hashmap.put(apprear[i], students.get(i));
        }
        System.out.println("The report as below:");
        hashmap.forEach((key, value) -> System.out.println(
                value.getName()+"|" +value.getCourseName()+"|"+key));
    }

    public void display(){
        System.out.println("Student list: ");
        for(var x: students){
            System.out.println(x);
        }
    }


}

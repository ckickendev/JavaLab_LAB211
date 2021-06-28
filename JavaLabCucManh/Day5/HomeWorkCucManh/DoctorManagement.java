package JavaLabCucManh.Day5.HomeWorkCucManh;

import java.util.ArrayList;

public class DoctorManagement {
    Validation validation = new Validation();
    ArrayList<Doctor> doctors = new ArrayList<>();

    public void addDoctor(){
        System.out.println("--------- Add Doctor ----------");
        System.out.print("Enter Code: ");
        String code = validation.checkInputString();
        System.out.print("Enter Name: ");
        String name = validation.checkInputString();
        System.out.print("Enter Specialization: ");
        String spe = validation.checkInputString();
        System.out.print("Enter Availability: ");
        int avai = validation.checkInputInteger();
        Doctor doctor = new Doctor(code, name, spe, avai);
        doctors.add(doctor);
        System.out.println("Add success !!! ");
    }

    public void updateDoctor(){
        System.out.println("--------- Update Doctor -------");
        System.out.print("Enter Code: ");
        String code = validation.checkUpdate();
        System.out.print("Enter Name: ");
        String name = validation.checkUpdate();
        System.out.print("Enter Specialization: ");
        String spe = validation.checkUpdate();
        System.out.print("Enter Availability: ");
        String avai = validation.checkUpdate();

        int index = -1;
        for(var x: doctors){
            if(x.getCode().compareToIgnoreCase(code)==0){
                index = doctors.indexOf(x);
                break;
            }
        }
        if(index == -1){
            System.out.println("Doctor code does not exist");
        }else {
            if(name.compareToIgnoreCase("")!=0){
                doctors.get(index).setName(name);
            }
            if(spe.compareToIgnoreCase("")!=0){
                doctors.get(index).setSpecialization(spe);
            }
            if(avai.compareToIgnoreCase("")!=0){
                doctors.get(index).setAvailability(Integer.parseInt(avai));
            }
            System.out.println("Update success !");
        }

    }

    public void deleteDoctor(){
        System.out.println("--------- Delete Doctor -------");
        System.out.print("Enter Code: ");
        String code = validation.checkInputString();
        int index = -1;
        for(var x:doctors){
            if(x.getCode().compareToIgnoreCase(code)==0){
                index = doctors.indexOf(x);
                break;
            }
        }
        if(index == -1){
            System.out.println("Code does not exist Doctor");
        }else {
            doctors.remove(index);
            System.out.println("Update success");
        }
    }

    public void Search(){
        System.out.println("---------- Search Doctor --------");
        System.out.print("Enter name: ");
        String name = validation.checkUpdate();
        ArrayList<Doctor> doctorsearch = new ArrayList<>();
        for(var x: doctors){
            if(x.getName().toLowerCase().contains(name.toLowerCase())){
                doctorsearch.add(x);
            }
        }
        System.out.println("--------- Result ------------");
        System.out.printf("%-10s%-15s%-20s%-20s\n", "Code", "Name", "Specialization", "Availability");
        if(name.trim().compareToIgnoreCase("")==0){
            for(var x: doctors){
                System.out.printf("%-10s%-15s%-20s%-20d\n", x.getCode(), x.getName(), x.getSpecialization(), x.getAvailability() );
            }
        }else {
            for(var x: doctorsearch){
                System.out.printf("%-10s%-15s%-20s%-20d\n", x.getCode(), x.getName(), x.getSpecialization(), x.getAvailability() );
            }
        }
    }
}

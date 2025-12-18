package Lab3;

public class Student {
    String studentID;
    String name;
    Address address;


    public Student(String studentID,String name,Address address){
        this.studentID = studentID;
        this.name = name;
        this.address = address;
    }

    public String getStudentInfo(){ 
        return studentID +" "+name+" "+address.getStreet()+" "+address.getCity()+" "+address.getZipcode();
    }
}

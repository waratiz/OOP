package Lab3;
public class TestAggregation {
    

    public static void main(String[] args) {

        Address home = new Address("123 Main St", "Chiang Mai", "50000");

        Student student = new Student("682115042","bas",home);

        System.out.println(student.getStudentInfo());

    }
}

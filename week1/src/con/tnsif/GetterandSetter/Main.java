package con.tnsif.GetterandSetter;



public class Main {
    public static void main(String[] args) {
        // Create an object of Student class
        student s1 = new student();{

        // Set values using setter methods
        s1.setId(101);
        s1.setName("Keerthana");

        // Get and display values using getter methods
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
    }
    }}


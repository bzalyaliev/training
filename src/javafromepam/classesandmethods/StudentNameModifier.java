package javafromepam.classesandmethods;

public class StudentNameModifier {

    public static void main(String[] args) {
        Student student = new Student("Victor");
        student.setName("Petr");
        //student.name = "Petr";
        System.out.println(student);


    }


}

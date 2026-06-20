public class MVCPatternTest {

    public static void main(String[] args) {

        Student student = new Student(
                "Nataraj EL",
                "SEC23AD010",
                "A+"
        );

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(student, studentView);


        System.out.println("Initial Student Record\n");
        studentController.updateView();


        System.out.println("\nUpdating Student Grade...\n");
        studentController.setStudentGrade("O");


        System.out.println("Updated Student Record\n");
        studentController.updateView();

    }

}
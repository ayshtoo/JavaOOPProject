interface  Student {

    default void calculateGrade() {
        System.out.println("Calculated Grade");
    }

    void calculateGPA();

}

class Teenager implements Student{

    @Override
    public void calculateGrade() {
        Student.super.calculateGrade();
    }

    @Override
    public void calculateGPA() {
        System.out.println("Your GPA is being calculated...");
    }
}

public class MainInterface {
    public static void main(String[] args) {
        Student Alan = new Student(){
            @Override
            public void calculateGPA() {
                System.out.println("Your GPA is being calculated...");
            }
        };
        Alan.calculateGPA();
    }

}

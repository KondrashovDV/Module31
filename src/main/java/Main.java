public class Main {

    public static void main(String[] args) {

        University university = new University("1", "Samara State Technical University", 1914, StudyProfile.TECHNICAL);
        Student student = new Student("Kondrashov Dmitry", "1", 1,10);

        System.out.println(university.toString());
        System.out.println(student.toString());

    }






}

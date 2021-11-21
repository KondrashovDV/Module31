import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<University> univer = new ArrayList<University>();
        List<Student> stud = new ArrayList<Student>();
        University university = new University("1", "Samara State Technical University", 1914, StudyProfile.TECHNICAL);
        Student student = new Student("Kondrashov Dmitry", "1", 1,10);
        University university1 = new University("2", "Samara State University", 1960, StudyProfile.HUMANITARIAN);
        Student student1 = new Student("Ivanov Ivan", "2", 1,12);
        University university2 = new University("3", "Samara State Medical University", 1900, StudyProfile.MEDICINE);
        Student student2 = new Student("Petrov Petr", "3", 2,11);
       // List<University> univer;
       // List<Student> stud;
        univer.add(university);
        univer.add(university1);
        univer.add(university2);
        stud.add(student);
        stud.add(student1);
        stud.add(student2);
        UniverComp univerComp = UtilComp.getUniverComp(UniverCompType.YEAROFFOUNDATION);
        univer.stream()
                .sorted(univerComp)
                .forEach(System.out::println);
        StudComp studComp = UtilComp.getStudComp(StudCompType.AVGEXAMSCORE);
        stud.stream()
                .sorted(studComp)
                .forEach(System.out::println);




        // System.out.println(university.toString());
       // System.out.println(student.toString());

    }






}

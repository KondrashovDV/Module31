import org.apache.commons.collections4.ComparatorUtils;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        /*List<University> univer = new ArrayList<University>();
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
       // System.out.println(student.toString()); */
        List<University> universities =
        XLRead.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniverComp universityComparator =
                UtilComp.getUniverComp(UniverCompType.YEAROFFOUNDATION);
        universities.sort(universityComparator);
        String universitiesJson = JsonUtil.universityListToJson(universities);
        // проверяем, что json создан успешно
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = JsonUtil.jsonToUniversityList(universitiesJson);
        // проверяем, что обратно коллекция воссоздаётся в таком же количестве элементов
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {
            String universityJson = JsonUtil.universityToJson(university);
            // проверяем, что json из отдельного элемента создан успешно
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonToUniversity(universityJson);
            // проверяем, что обратно элемент воссоздаётся
            System.out.println(universityFromJson);
        });
        List<Student> students =
                XLRead.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudComp studentComparator =
                UtilComp.getStudComp(StudCompType.AVGEXAMSCORE);
        students.sort(studentComparator);
        String studentsJson = JsonUtil.studentListToJson(students);
        // проверяем, что json создан успешно
        System.out.println(studentsJson);
        List<Student> studentsFromJson = JsonUtil.jsonToStudentList(studentsJson);
        // проверяем, что обратно коллекция воссоздаётся в таком же количестве элементов
        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {
            String studentJson = JsonUtil.studentToJson(student);
            // проверяем, что json из отдельного элемента создан успешно
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonToStudent(studentJson);
            // проверяем, что обратно элемент воссоздаётся
            System.out.println(studentFromJson);
        });

        List<Stat> statisticsList = StatUtil.createStatistics(students, universities);
        XLWrite.writeXlsStatistics(statisticsList, "src/main/resources/stat.xlsx");
    }

    }


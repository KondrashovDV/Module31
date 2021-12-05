import org.apache.commons.lang3.StringUtils;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;


public class StatUtil {

       private StatUtil() {
        }

        public static List<Stat> createStatistics(List<Student> students,
                                                        List<University> universities) {

            List<Stat> statisticsList = new ArrayList<>();

            Set<StudyProfile> profiles = universities.stream()
                    .map(University::getMainProfile)
                    .collect(Collectors.toSet());

            profiles.forEach(profile -> {
                Stat statistics = new Stat();
                statisticsList.add(statistics);
                statistics.setProfile(profile);

                List<String> profileUniversityIds = universities.stream()
                        .filter(university -> university.getMainProfile().equals(profile))
                        .map(University::getId)
                        .collect(Collectors.toList());
                statistics.setNumberOfUniversities(profileUniversityIds.size());
                statistics.setUniversityNames(StringUtils.EMPTY);
                universities.stream()
                        .filter(university -> profileUniversityIds.contains(university.getId()))
                        .map(University::getFullName)
                        .forEach(fullNameUniversity -> statistics.setUniversityNames(
                                statistics.getUniversityNames() + fullNameUniversity + ";"));
                List<Student> profileStudents = students.stream()
                        .filter(student -> profileUniversityIds.contains(student.getUniversityId()))
                        .collect(Collectors.toList());
                statistics.setNumberOfStudents(profileStudents.size());
                OptionalDouble avgExamScore = profileStudents.stream()
                        .mapToDouble(Student::getAvgExamScore)
                        .average();
                statistics.setAvgExamScore(0);
                avgExamScore.ifPresent(value -> statistics.setAvgExamScore(
                        (float) BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue()));
            });

            return statisticsList;
        }
}

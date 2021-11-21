import org.apache.commons.lang3.StringUtils;
public class StudAvgExamScoreComp implements StudComp{
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getAvgExamScore(), o1.getAvgExamScore());
    }
}

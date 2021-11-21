import org.apache.commons.lang3.StringUtils;
public class StudCurretCourseNumberComp implements StudComp{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}

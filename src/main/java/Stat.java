public class Stat {
    private StudyProfile profile;
    private float avgExamScore;
    private int numberOfStudents;
    private int numberOfUniversities;
    private String universityNames;

    public StudyProfile getProfile() {
        return profile;
    }

    public Stat setProfile(StudyProfile profile) {
        this.profile = profile;
        return this;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Stat setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Stat setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        return this;
    }

    public int getNumberOfUniversities() {
        return numberOfUniversities;
    }

    public Stat setNumberOfUniversities(int numberOfUniversities) {
        this.numberOfUniversities = numberOfUniversities;
        return this;
    }

    public String getUniversityNames() {
        return universityNames;
    }

    public Stat setUniversityNames(String universityNames) {
        this.universityNames = universityNames;
        return this;
    }
}

public enum StudyProfile {
    TECHNICAL("Технический"),
    MEDICINE("Медицина"),
    HUMANITARIAN("Гумунитарный"),
    PHYSICS("Физический"),
    LINGUISTICS("Лингвистический"),
    MATHEMATICS("Математический");

    public final String label;

    StudyProfile(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

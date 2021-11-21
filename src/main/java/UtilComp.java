public class UtilComp {
    public static StudComp getStudComp(StudCompType studCompType){
        switch (studCompType)
        {
            case FULLNAME -> {
                return new StudUniversityIDComp();
            }
            case CURRENTCOURSENUMBER -> {
                return new StudCurretCourseNumberComp();
            }
            case UNIVERSITYID -> {
                return new StudUniversityIDComp();
            }
            case AVGEXAMSCORE -> {
                return new StudAvgExamScoreComp();
            }
            default -> {
                return new StudFullNameComp();
            }
        }
    }
    public static UniverComp getUniverComp(UniverCompType univerCompType){
        switch (univerCompType) {
            case ID -> {
                return new UniverIdComp();
            }
            case FULLNAME -> {
                return new UniverFullNameComp();
            }
            case SHORTNAME -> {
                return new UniverShortNameComp();
            }
            case MAINPROFILE -> {
                return new UniverMainProfileComp();
            }
            case YEAROFFOUNDATION -> {
                return new UniverYearOfFoundationComp();
            }
            default -> {
                return new UniverFullNameComp();
            }
        }
    }
}
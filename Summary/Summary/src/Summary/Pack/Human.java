package Summary.Pack;

public abstract class Human {
    private String humanName;
    private int humanAge;
    private String humanGender;
    private String humanSchoolLevel;

    public Human(String humanName, int humanAge, String humanGender, String humaSchoolLevel) {
        this.humanName = humanName;
        this.humanAge = humanAge;
        this.humanGender = humanGender;
        this.humanSchoolLevel = humaSchoolLevel;
    }

    public void setHumanSchoolLevel(String humanSchoolLevel) {
        this.humanSchoolLevel = humanSchoolLevel;
    }

    public String getHumanName() {
        return humanName;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public String getHumanGender() {
        return humanGender;
    }

    public String getHumanSchoolLevel() {
        return humanSchoolLevel;
    }
}

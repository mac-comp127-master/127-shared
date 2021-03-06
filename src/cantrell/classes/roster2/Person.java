package cantrell.classes.roster2;

public class Person {
    private String givenName;
    private String familyName;
    private boolean familyNameFirst;

    public Person(String givenName, String familyName, boolean familyNameFirst) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.familyNameFirst = familyNameFirst;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFullName() {
        if (familyNameFirst) {
            return familyName + " " + givenName;
        } else {
            return givenName + " " + familyName;
        }
    }
}









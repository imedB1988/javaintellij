public class Subject {

private String subjectCode;
private String subjectName;

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public Subject(Subject subject) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public boolean equals(Subject object) {

        return this.subjectName.equals(object.subjectName) && this.subjectCode.equals(object.subjectCode);

    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String toString()
    {
        return  "subject information : " + subjectCode + " " + subjectName;
    }
}

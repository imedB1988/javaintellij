public class ExamPaper {


    private  Student student;
    private Subject subject;
    private int marks;

    public ExamPaper(Student student, Subject subject, int marks) {
        this.student = student;
        this.subject = subject;
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

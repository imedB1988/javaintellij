public class Student {

    private String name;
    private long number;

    public Student(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public Student(Student student) {

        this.name=student.name;
        this.number = student.number;
    }


    public boolean equals(Student obj) {
        if(this.number == obj.number && this.name.equals(obj.name))
        {
            return true;
        }
        else
        {
            return  false;
        }

    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String toString()
    {
        return  "subject information : " + name + " " + number;
    }
}

public class RegisterNode {
    int studentID;
    int courseID;
    int grade;
    RegisterNode nextStudent;
    RegisterNode nextClass;

    public RegisterNode(int studentID, int courseID, int grade, RegisterNode nextStudent, RegisterNode nextClass) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.grade = grade;
        this.nextStudent = nextStudent;
        this.nextClass = nextClass;
    }

    public RegisterNode(int studentID, int courseID, int grade) {
        this(studentID, courseID, grade, null, null);
    }

    public RegisterNode(int studentID, int courseID) {
        this(studentID, courseID, 10, null, null);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}

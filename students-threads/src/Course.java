

public class Course {
    private int studentFinalScore;
    private String courseName;

    public Course(String courseName, int studentFinalScore) {
        this.courseName = courseName;
        this.studentFinalScore = studentFinalScore;
    }

    public Course(Course otherCourse) {
        this(otherCourse.courseName, otherCourse.studentFinalScore);
    }

    public Course() {
    }

    public void setStudentFinalScore(int studentFinalScore) {
        this.studentFinalScore = studentFinalScore;
    }

    public int getStudentFinalScore() {
        return studentFinalScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String describeCourse() {
        return ("The final score is " + this.studentFinalScore + " in " + this.courseName + " course \n");
    }
}

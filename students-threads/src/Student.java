//Yakov Hazout - 205874233
//Guy Kozliner - 316612662

public class Student {
    private String id;
    private String name;
    private Course[] coursesArray;

    public Student(String id, String name, Course[] courses) throws NameException, IDException, IllegalDividing {
        this.id = setId(id);
        this.name = setName(name);
        this.coursesArray = courses;
        coursesArray = new Course[3];
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setId(String id) throws IDException {
        if (id.matches("[0-9]+") && id.length() >= 9) {
            this.id = id;
        } else {
            throw new IDException("must be longer then 8 number and must contain only numbers.\n");
        }
//            Student student = new Student(id, name);
//            System.out.println(student);
//        } catch ( IDException e){
//            System.out.println(e + "must be longer then 8 number and must contain only numbers.\n");
//        }
//        this.id = id;
        return id;
    }

    public String setName(String name) throws NameException {
        char startingWith = name.charAt(0);

        if ((startingWith >= 'a' && startingWith < 'z') || (startingWith >= 'A' && startingWith < 'Z')) {
            this.name = name;
        } else {
            throw new NameException("name is illegal, must start with english letter\n");
        }
        return name;
    }

    public void setCoursesArray(Course[] coursesArray) {
        this.coursesArray = coursesArray;
    }

    public Student(String id, String name) throws NameException, IDException {
    }

    public void addCourse(Course course) throws ArrayIndexOutOfBoundsException {
        try {
            int flag = 0;
            for (int i = 0; flag == 0; i++) {
                if (coursesArray[i] == null) {
                    coursesArray[i] = course;
                    flag++;
                    System.out.println("A new course has been added to the course list: " + course.getCourseName());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Course[] copiedArray = new Course[coursesArray.length * 2];
            System.arraycopy(coursesArray, 0, copiedArray, 0, coursesArray.length * 2);
            coursesArray = copiedArray;
            System.out.println(e + "new array has been declared, his size is" + coursesArray.length * 2 + "\n");
//        if(coursesArray[coursesArray.length-1] != null){
//            throw new NameException(course + "has not been added")
        }
    }

    public double calculateAvarage() throws ArithmeticException {
        int avarageScore, count = 0, totalScore = 0;
        try {
            for (Course course : coursesArray) {
                if (course != null) {
                    totalScore += course.getStudentFinalScore();
                    count++;
                }
            }
            avarageScore = totalScore / count;
            return avarageScore;
        } catch (ArithmeticException e) {
            System.out.println(e + "There's no courses for that student.\n");
            return 0;
        }
    }

    private Course findCourse(Course desiredCourse) {
        Course duplicatedCourse = new Course();
        try {
            for (Course course : coursesArray) {
                if (course == desiredCourse) {
                    duplicatedCourse = desiredCourse;
                    return duplicatedCourse;
                }
            }
            System.out.println("The course has not been found\n");
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "The course has not been found\n");
            return null;
        }
    }

    public void findCourseAndPrint(Course desiredCourse) {
        for (Course course : coursesArray) {
            if (course.equals(desiredCourse)) {
                System.out.print(desiredCourse.describeCourse());
            } else {
                throw new NullPointerException("The course has not been found\n");
            }
        }
    }
}
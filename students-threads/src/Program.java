//Yakov Hazout - 205874233
//Guy Kozliner - 316612662

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws NameException, IDException {
        //Student student2 = null;
        //Course EconomicsCourse = new Course("Economics", 97);
        Scanner scanner = new Scanner(System.in);
        Student student1 = null;
        Course DEVOPS = new Course("DEVOPS", 77);
        while (student1 == null) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter student's name: \n");
                String name = input.next();
                System.out.println("Please enter student's id: \n");
                String id = input.next();
                student1 = new Student(id, name, null);
                student1.calculateAvarage();
                Course sport = new Course("Sport", 99);
                Course python = new Course("Python", 97);
                Course java = new Course("Java", 100);
                //Course WEB= new Course ("WEB",94);
                student1.addCourse(sport);
                student1.addCourse(python);
                student1.addCourse(java);
                //student1.addCourse(WEB);
                student1.findCourseAndPrint(DEVOPS);
                student1.findCourseAndPrint(DEVOPS);
            } catch (IDException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
                System.out.println(e);
            } catch (NullPointerException e) {
                System.out.println("Error:Course " + DEVOPS.getCourseName() + " doesn’t exist for student " + student1.getName());
            } catch (IllegalDividing illegalDividing) {
                illegalDividing.printStackTrace();
            } finally {
                System.out.println(DEVOPS.describeCourse());
            }
        }
    }
}

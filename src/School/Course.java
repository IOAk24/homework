package School;

public class Course {
    private String department;
    private int courseNumber;
    private int creditHours;

    public Course(String department, int courseNumber, int creditHours){
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }
    public String getDepartment(){
        return department;
    }
    public int getCourseNumber(){
        return courseNumber;
    }
    public int getCreditHours(){
        return creditHours;
    }
    public String toString(){
        return "Course{department='" + department + "', courseNumber=" + courseNumber + ", creditHours=" + creditHours + "}";
    }
    public static void main(String[] args) {
        Course course1 = new Course("Math", 12, 4);
        Course course2 = new Course("English", 24, 4);
        System.out.println(course1);
        System.out.println(course2);
    }
}

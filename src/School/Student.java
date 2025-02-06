package School;

public class Student {
    private String Name;
    private int IdNumber;
    private static int nextID = 1;

    public Student (String Name, int IdNumber){
        this.Name = Name;
        this.IdNumber = IdNumber;
    }
    public Student(String name) {
        this.Name = name;
        this.IdNumber = nextID;
        nextID++;
    }
    public String getName(){
        return Name;
    }
    public int getIdNumber(){
        return IdNumber;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public boolean precedesById(Student other) {
        return this.IdNumber < other.IdNumber;
    }
    public String toString() {
        return "Student{name='" + Name + "', idNumber=" + IdNumber + "}";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Parker Nelson", 123);
        Student student2 = new Student("Kendrick Achebe", 456);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("student1 precedes student2: " + student1.precedesById(student2)); // Should print true
        System.out.println("student2 precedes student1: " + student2.precedesById(student1)); // Should print false
    }
}
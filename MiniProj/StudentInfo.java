class Student{
    String name;
    int age;
    int marks;
    public Student(String name, int age, int marks){
        this.name= name;
        this.age = age;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 18, 80);
        s1.display();
        Student s2 = new Student("John", 18, 86);
        s2.display();
        Student s3 = new Student("John", 18, 92);
        s3.display();

        double avg = (double) (s1.marks + s2.marks + s3.marks)/3;
        System.out.println();
        System.out.println("Class Average: "+avg);
    }
}

import java.util.*;
public class AcademicClass{
  public AcademicClass(){
    students = new ArrayList<Student>();
    teacher = new Teacher("Mr. Cameron", "History");
  }

  public void addStudent(String name, int number){
    students.add(new Student(name, number));
  }
  public void attendance(){
    System.out.println("Teacher: "+ teacher.getName() + " Subject: " + teacher.getSubject());
    System.out.println("Students: ");
    for(int i = 0; i < students.size(); i++){
      System.out.println((i+1) + ". " + students.get(i).getName());
    }
  }
  public ArrayList<String> favNumber(int n){
    ArrayList<String> count = new ArrayList<String>();
    for(int i = 0; i < students.size(); i++){
      if(students.get(i).getNum() == n){
        count.add(students.get(i).getName());
      }
    }
    return count;
  }
  public ArrayList<String> oddStudents(){
    ArrayList<String> count = new ArrayList<String>();
    for(int i = 0; i < students.size(); i++){
      if(students.get(i).getNum() % 2 == 1){
        count.add(students.get(i).getName());
      }
    }
    return count;
  }
  private ArrayList<Student> students;
  private Teacher teacher;

  public static void main(String[] args){
    AcademicClass Bperiod = new AcademicClass();
    Bperiod.addStudent("Rachel", 91);

    Bperiod.attendance();
    System.out.println(Bperiod.favNumber(91).get(0));
    System.out.println(Bperiod.oddStudents().get(0));
  }
}

import java.util.*;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    Student(int rollno,String name){
        super();
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public int compareTo(Student s){
        if(this.rollno>s.rollno)return -1;
        else if(this.rollno<s.rollno) return 1;
        else return 0;
    }
}
public class comparable{
    public static void main(String args[]){
        ArrayList<Student> Students =new ArrayList<Student>();
        Students.add(new Student(6,"A"));
        Students.add(new Student(7,"B"));
        Students.add(new Student(4,"C"));
        Students.add(new Student(2,"D"));
        Students.add(new Student(1,"E"));

        Collections.sort(Students);
        System.out.println("Students sorted in descending order according to rollno");
        for(Student s:Students){
            System.out.println("rollno: "+s.rollno+" Name: "+s.name);
        }
    }
}
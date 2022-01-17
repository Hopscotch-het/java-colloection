import java.util.*;

class StudentClass{
    int rollno;
    String name;
    StudentClass(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }

}
class NameComparator implements Comparator{
    public int compare(Object o1,Object o2){
        StudentClass s1=(StudentClass)o1;
        StudentClass s2=(StudentClass)o2;
        return s1.name.compareTo(s2.name);
    }
}
class rollnoComparator implements Comparator{
    public int compare(Object o1,Object o2){
        StudentClass s1=(StudentClass)o1;
        StudentClass s2=(StudentClass)o2;
        return s1.rollno-s2.rollno;
    }
}

public class comparator{
    public static void main(String args[]){
        ArrayList<StudentClass> Students =new ArrayList();
        Students.add(new StudentClass(3,"E"));
        Students.add(new StudentClass(7,"A"));
        Students.add(new StudentClass(6,"D"));
        Students.add(new StudentClass(4,"B"));
        Students.add(new StudentClass(5,"C"));

        System.out.println("Sorting on the basis of rollno");

        Collections.sort(Students,new rollnoComparator());
        for(StudentClass s:Students){
            System.out.println("rollno: "+s.rollno+" Name: "+s.name);
        }
        System.out.println("Sorting on the basis of name");


        Collections.sort(Students,new NameComparator());
        for(StudentClass s:Students){
            System.out.println("rollno: "+s.rollno+" Name: "+s.name);
        }
    }
}
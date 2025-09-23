package lesson3;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Student> studentList  = new ArrayList<>();
    studentList.add(new Student("Ali",20));
    studentList.add(new Student("Vali",25));
    studentList.add(new Student("G'ani",18));

    for (Student student : studentList) {
      System.out.println(student);
    }

    System.out.println(studentList);
  }

}

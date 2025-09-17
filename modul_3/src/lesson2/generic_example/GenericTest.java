package lesson2.generic_example;

public class GenericTest {

  public static void main(String[] args) {

    Holder <Integer> holder = new Holder<Integer>();
    holder.setValue(1);
    System.out.println(holder.getValue());

    Holder <String> holder2 = new Holder<String>();
    holder2.setValue("Hello");
    System.out.println(holder2.getValue());

    Holder <Student> holder3 = new Holder<Student>();
    holder3.setValue(new Student("Ali"));
    System.out.println(holder3.getValue());

    var holder4 = new Holder<String>();
    holder4.setValue("Hello");
    System.out.println(holder4.getValue());


  }




}

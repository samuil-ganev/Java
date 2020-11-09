class Main {
  
  public static void main(String[] args) {
    
    Student[] students = new Student[5];

    for (int i=0;i<5;++i) {

      String name = new java.util.Scanner(System.in).nextLine();
      double grade = new java.util.Scanner(System.in).nextDouble();

      students[i] = new Student(name, grade);

    }

    for (Student student : students[0].ret_schship(students)) {

      System.out.println(student.name);

    }

  }

}

class Student {

  private String name;
  private double grade;

  Student() {}

  Student(String name, double grade) {

    this.name = name;
    this.grade = grade;

  }

  boolean scholarship(Student st) {

    if (st.grade >= 5.5)
      return true;

    return false;

  }

  Student[] ret_schship(Student[] students) {

    Student[] ret = new Student[5];
    int index = 0;

    for (Student student : students) {

      if (scholarship(student)) {

        ret[index] = student;
        index++;

      }

    }

    return ret;

  }

}

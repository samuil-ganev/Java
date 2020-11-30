class Course {

  String courseName;
  String[] students;
  int numberOfStudents;

  Course(String courseName) {

    this.courseName = courseName;
    String[] students = new String[100];
    numberOfStudents = 0;

  }

  String getCourseName() {

    return this.courseName;

  }

  void addStudent(String name) {

    students[numberOfStudents] = name;
    numberOfStudents++;

  }

  void dropStudents(String name) {

    String[] newStudents = new String[numberOfStudents];
    
    for (int i=0,j=0;j<numberOfStudents;++j) {

      if (name != students[j]) {
      
        newStudents[i] = students[j];
        i++;

      }

    }

    numberOfStudents--;

  }

}

public class PersonTest {

    public static void main(String[] args) {
        
        Person person = new Person("Az", "Sofia", "test@gmail.com", 123);
        Student student = new Student("Ti", "Sofia", "test@gmail.com", 123, "junior");
        Employee employee = new Employee("Toi", "Sofia", "test@gmail.com", 123, 135, 1200);
        Faculty faculty = new Faculty("Tq", "Sofia", "test@gmail.com", 123, 135, 1200, 73, "Associate Professor");
        Staff staff = new Staff("To", "Sofia", "test@gmail.com", 123, 135, 1200, "Instructor");
        
        System.out.print(person.toString() + student.toString() + employee.toString() + faculty.toString() + staff.toString());
    
    }
    
}

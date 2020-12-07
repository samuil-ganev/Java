public class Student extends  Person {
    
    String classStatus;
    
    
    public Student(String name, String adress, String eMail, int phoneNumber) {
    
        super(name, adress, eMail, phoneNumber);
        classStatus = "freshman";
    
    }
    
    
    public Student(String name, String adress, String eMail, int phoneNumber, String classStatus) {
        
        super(name, adress, eMail, phoneNumber);
    
        this.classStatus = classStatus;
    
    }
    
    
    public String getClassStstus() {
    
        return classStatus;
    
    }

    
    public void setClassStstus(String classStatus) {
    
        this.classStatus = classStatus;
    
    }
    
    
    public String toString() {
    
        return super.toString() + "\nClass status  : " + classStatus;

    }

}

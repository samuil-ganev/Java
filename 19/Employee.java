public class Employee extends Person {
    
    int office;
    double salary;
    Date dateHired;
    
    
    public Employee(String name, String adress, String eMail, int phoneNumber, int office, double salary) {
        
        super(name, adress, eMail, phoneNumber);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();
    
    }
    
    
    public int getOffice() {
    
        return office;
    
    }
    
    public void setOffice(int office) {
    
        this.office = office;
    
    }
    
    
    public double getSalary() {
        
        return salary;
    
    }
    
    
    public void setSalary(double salary) {
    
        this.salary = salary;
    
    }
    
    
    public Date getDateHired() {
    
        return dateHired;
    
    }
    
    
    public String toString() {
    
        return super.toString() + "\nOffice         : " + office
                                + "\nSalary         : " + salary
                                + "\nDate hired     : " + dateHired;
    
    }

}

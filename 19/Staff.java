public class Staff extends Employee {
    
    String title;
    
    Staff(String name, String adress, String eMail, int phoneNumber, int office, double salary, String title) {
    
        super(name, adress, eMail, phoneNumber, office, salary);
        this.title = title;
    
    }
    
    
    public String getTitle() {
     
       return title;
    
    }

    
    public void setTitle(String title) {
    
      this.title = title;
    
    }
    
    
    public String toString() {
        
        return super.toString() + "\nTitle         : " + title;

    }

}

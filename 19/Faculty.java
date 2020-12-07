public class Faculty extends Employee {
    
    int hours;
    String rank;
    
    
    public Faculty(String name, String adress, String eMail, int phoneNumber,
                   int office, double salary, int hours, String rank) {
        
        super(name, adress, eMail, phoneNumber, office, salary);
        this.hours = hours;
        this.rank = rank;
    
    }
    
    
    public int getHours() {
    
        return hours;
    
    }
    
    
    public void setHours(int hours) {
    
        this.hours = hours;
    
    }
    
    
    public String getRank() {
    
        return rank;
    
    }
    
    
    public void setRank(String rank) {
    
        this.rank = rank;
    
    }
    
    
    public String toString() {
    
        return super.toString() + "\nHours         : " + hours
                                   + "\nRank         : " + rank;
    }

}

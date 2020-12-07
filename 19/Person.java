public class Person {
    
    String name;
    String adress;
    String eMail;
    int phoneNumber;
    
    
    public Person(String name, String adress, String eMail, int phoneNumber) {
    
        this.name = name;
        this.adress = adress;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    
    }
    
    
    public String getName() {
    
        return name;
    
    }
    
    
    public void setName(String name) {
     
        this.name = name;
    
    }
    
    public String getAdress() {
    
        return adress;
    
    }
    
    public void setAdress(String adress) {
        
        this.adress = adress;
    
    }
    
    
    public int getPhoneNumber() {
    
        return phoneNumber;
    
    }
    
    
    public void setPhoneNumber(int phoneNumber) {
    
        this.phoneNumber = phoneNumber;
    
    }
    
    
    public String geteMail() {
    
        return eMail;
    
    }
    
    
    public void seteMail(String eMail) {
    
        this.eMail = eMail;
    
    }
    
    
    public String toString() {
    
        return "\n\nName         : " + name
               + "\nAdress         : " + adress
               + "\nE-Mail         : " + eMail
               + "\nPhone number : " + 0 + phoneNumber;       
    
    }

}

public class Main {

    int channel;
    int volumeLevel;
    boolean on;
    
    public TV(int newVolume,int newChannel, boolean isOn) {
    
        if(newChannel > 0 && newChannel < 121) {
    
            channel = newChannel;
    
        }else {
    
            channel = 1;
            System.out.println("Please choose a valid value for the channel. Channel set to the default value.");
        
        }
        
        if(newVolume > 0 && newVolume < 8) {
        
            volumeLevel = newVolume;
        
        }else {
        
            volumeLevel = 1;
            System.out.println("Please choose a valid value for the volume. Volume set to the default value.");
        
        }
        
        on = isOn;
    
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    public void setChannel (int newChannel) {
    
        if(newChannel > 0 && newChannel < 121) {
    
            channel = newChannel;
    
        } else {
            
            System.out.println("Please choose a valid value for the channel.");
        
        }
    
    }
    
    public void setVolume (int newVolume) {
        
        if(newVolume > 0 && newVolume < 121) {
        
            volumeLevel = newVolume;
        
        } else {
            
            System.out.println("Please choose a valid value for the volume.");
     
        }
    
    }
    
    public void channelUp () {
    
        if(channel != 120) {
    
            channel += 1;
    
        } else {
            
            System.out.println("There are no more channels.");
        
        }
    
    }
    
    public void channelDown () {
    
        if(channel != 1) {
    
            channel -= 1;
    
        } else {
            
            System.out.println("There are no more channels.");
        
        }
    
    }
    
    public void volumeUp () {
    
        if(volumeLevel != 7) {
    
            volumeLevel += 1;
    
        } else {
            
            System.out.println("Maximum volume");
        }

    }
    
    public void volumeDown () {
    
        if(volumeLevel != 1) {
    
            volumeLevel -= 1;
    
        } else {
            
            System.out.println("Minimum volume");
        
        }
    
    }

}

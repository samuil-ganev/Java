public class MyPoint {
    
    double x;
    double y;
    
    MyPoint (){
        
        this.x = 0;
        this.y = 0;
    
    }
    
    MyPoint (double newX, double newY){
        
        this.x = newX;
        this.y = newY;
    
    }
    
    public double getX() {
    
      return this.x;
    
    }
    
    public void setX(double x) {
    
      this.x = x;
    
    }
    
    public double getY() {
    
      return y;
    
    }
    
    public void setY(double y) {
    
      this.y = y;
    
    }
    
    public double distance (MyPoint point) {
    
      return Math.sqrt(Math.pow((x - point.getX()), 2) + Math.pow((y - point.getY()), 2));
    
    }
    
    public double distance (double x, double y) {
    
      return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    
    }
    
    public static double distance (MyPoint a, MyPoint b) {
    
      return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    
    }
    
}

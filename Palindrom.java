class Palindrom {

    public static void main(String[] args) {
       
        int numbers = 120;
        int num = 2;
        
        while (numbers--) {
            
            if (isPalindromicPrime(num)) {
            
                System.out.println(num + " ");
            
            }
            
            num++;
        
        }
       
    }
    
    public static boolean isPalindromicPrime(int num) {
        
        int reversed = 0;
        double m = Math.ceil(Math.sqrt(num));
        
        for (int i = 2;i<=m;++i) {
          
          if (num % i == 0)
              return false;
        
        }
        
        int numCopy = num;
       
        while (numCopy != 0) {
              
              int digit = numCopy % 10;
              reversed = reversed * 10 + digit;
              numCopy /= 10;
            
        }
        
        if (reversed != num)
            return false;
        
        return true;
    
    }

}

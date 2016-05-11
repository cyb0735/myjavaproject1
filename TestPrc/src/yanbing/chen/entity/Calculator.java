package yanbing.chen.entity;

public class Calculator {  
	  
    public int add(int a, int b) {  
        return a + b;  
    }  
  
    public int minus(int a, int b) {  
        return a - b;  
    }  
  
    public int square(int n) {  
        return n * n;  
    }  
      
    //Bug : 
    public void squareRoot(int n) {  
        for(; ;)  
            ;  
    }  
      
    public int multiply(int a, int b) {  
        return a * b;  
    }  
  
    public int divide(int a, int b) throws Exception {  
        if (0 == b) {  
            throw new Exception("00000");  
        }  
        return a / b;  
    }  
}  

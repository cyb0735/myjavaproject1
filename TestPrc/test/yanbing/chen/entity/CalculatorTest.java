/**
 * 
 */
package yanbing.chen.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
  
public class CalculatorTest {  
  
    private Calculator cal = new Calculator();  
  
    @BeforeClass  
    public static void before()  
    {  
        System.out.println("global");  
    }  
  
    @AfterClass  
    public static void after() {  
        System.out.println("global destroy");  
    }  
  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("start..");  
    }  
  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("end..");  
    }  
  
    @Test  
    @Ignore  
    public void testAdd() {  
        int result = cal.add(1, 2);  
        Assert.assertEquals(3, result);  
    }  
  
    @Test  
    public void testMinus() {  
        int result = cal.minus(5, 2);  
        Assert.assertEquals(3, result);  
    }  
  
    @Test  
    public void testMultiply() {  
        int result = cal.multiply(4, 2);  
        Assert.assertEquals(8, result);  
    }  
  
    @Test(timeout = 1000)   
    public void testSquareRoot() {  
        cal.squareRoot(4);  
    }  
  
    @Test(expected = Exception.class)  
    public void testDivide() throws Exception {  
        System.out.println("teddd");  
        cal.divide(4, 0);
    }  
  
//  @Test  
//  public void testDivide() {  
//      int result = 0;  
//      try {  
//          result = cal.divide(10, 5);  
//      } catch (Exception e) {  
//          e.printStackTrace();  
//          Assert.fail();
//      }  
//      Assert.assertEquals(2, result);  
//  }  
} 
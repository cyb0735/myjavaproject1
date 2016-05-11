package yanbing.chen.entity;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;


//@RunWith(JMockit.class)
public class TestnumsTest{
	@Tested
	Testnums testnums;
	
	@Mocked
	CreatNums nums;

	@Test
	public void testTestnums() throws Exception{
		new NonStrictExpectations(){
			{
				nums.getA();
				result=3;
			}
			{
				nums.getB();
				result=5;
			}
			{
				nums.getC();
				result=7;
			}
			};
			System.out.println("11111");
			testnums.func1();
	}
	
//	@Test
//	public void TestnumsTest() throws Exception{
//		
//			
//			System.out.println("11111");
//		}
	
	
	

}

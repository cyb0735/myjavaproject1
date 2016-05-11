package yanbing.chen.entity;
import yanbing.chen.entity.CreatNums;
//import java.lang.Math;
public class Testnums {
	public static String sa = "Fizz";
	public static String sb = "Buzz";
	public static String sc = "Whizz";
	
	
	public void func1(){
		CreatNums nums = new CreatNums();
		int a = nums.getA();
		int b = nums.getB();
		int c = nums.getC();
		
		//paixu
		int temp = 0;
		if (a > b){
			temp = a;
			a = b;
			b = temp;
		}
		if (a > c){
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c){
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a+"\t"+b+" \t"+c+'\n');

		//baoshu
		for(int i=1;i<100;i++){
			if (i%10 == a || i/10%10 == a){System.out.println(i+" "+sa);}
			else {
				if (i%a ==0 && i%b ==0 && i%c ==0){System.out.println(i+" "+sa+sb+sc);}
				else {
					if (i%a ==0 && i%b ==0){
						System.out.println(i+" "+sa+sb);
					}else {
						if (i%a == 0 && i%c == 0){System.out.println(i+" "+sa+sc);}
						else{
							if (i%b == 0 && i%c == 0){System.out.println(i+" "+sb+sc);}
							else{
								if (i%a == 0){System.out.println(i+" "+sa);}
								else{
									if (i%b == 0){System.out.println(i+" "+sb);}
									else{
										if(i%c ==0){System.out.println(i+" "+sc);}
										else{
											System.out.println(i+" "+i);
											}
										}
									}
								}
							}
						}
					}
				} 
	}
			
	}
	public static void main(String args[]){
		Testnums testnums = new Testnums();
		testnums.func1();
	}
}
